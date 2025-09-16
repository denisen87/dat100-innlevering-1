


import java.util.Scanner;

public class KarakterBeregning {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Les inn poengsum
        System.out.print("Skriv inn poengsum (0 - 100): ");
        int poeng = scanner.nextInt();

        // Sjekk at poeng er gyldig
        if (poeng < 0 || poeng > 100) {
            System.out.println("Ugyldig poengsum! Må være mellom 0 og 100.");
        } else if (poeng >= 90) {
            System.out.println("Karakter: A");
        } else if (poeng >= 80) {
            System.out.println("Karakter: B");
        } else if (poeng >= 60) {
            System.out.println("Karakter: C");
        } else if (poeng >= 50) {
            System.out.println("Karakter: D");
        } else if (poeng >= 40) {
            System.out.println("Karakter: E");
        } else {
            System.out.println("Karakter: F");
        }

        scanner.close();
    }
}

