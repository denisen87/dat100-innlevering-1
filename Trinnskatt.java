

import java.util.Scanner;

public class Trinnskatt {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Les inn bruttoinntekt
        System.out.print("Skriv inn bruttoinntekt i kroner: ");
        double inntekt = scanner.nextDouble();

        double skatt = 0;

        if (inntekt <= 217400) {
            skatt = 0;
        } 
        else if (inntekt <= 306050) {
            skatt = (inntekt - 217400) * 0.017;
        } 
        else if (inntekt <= 697150) {
            skatt = (306050 - 217400) * 0.017 +
                    (inntekt - 306050) * 0.04;
        } 
        else if (inntekt <= 942400) {
            skatt = (306050 - 217400) * 0.017 +
                    (697150 - 306050) * 0.04 +
                    (inntekt - 697150) * 0.137;
        } 
        else if (inntekt <= 1410750) {
            skatt = (306050 - 217400) * 0.017 +
                    (697150 - 306050) * 0.04 +
                    (942400 - 697150) * 0.137 +
                    (inntekt - 942400) * 0.167;
        } 
        else {
            skatt = (306050 - 217400) * 0.017 +
                    (697150 - 306050) * 0.04 +
                    (942400 - 697150) * 0.137 +
                    (1410750 - 942400) * 0.167 +
                    (inntekt - 1410750) * 0.177;
        }

        System.out.printf("Beregnet trinnskatt: %.2f kroner%n", skatt);
    }
}
