import java.util.Scanner;

public class karakterberegning {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        for (int i = 0; i < 10; i++) {
            int poeng;

            // Les inn poengsum helt til brukeren skriver noe gyldig
            while (true) {
                System.out.print("Skriv inn poengsum (0 - 100): ");
                poeng = scanner.nextInt();

                if (poeng >= 0 && poeng <= 100) {
                    break; // gyldig input, hopp ut av while-løkka
                } else {
                    System.out.println("Ugyldig poengsum! Må være mellom 0 og 100. Prøv igjen.");
                }
            }

            // Sjekk poeng og skriv ut karakter
            if (poeng >= 90) {
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
        }

        scanner.close(); // lukk scanner etter at alle innlesinger er ferdige
    }
}

