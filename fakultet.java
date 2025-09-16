


import java.util.Scanner;

public class fakultet {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Be brukeren skrive inn et heltall n > 0
        System.out.print("Skriv inn et heltall n (>0): ");
        int n = scanner.nextInt();

        if (n <= 0) {
            System.out.println("Feil! n må være større enn 0.");
            return;
        }

        // Beregn n! (fakultet)
        long fakultet = 1; // bruk long for større tall
        for (int i = 1; i <= n; i++) {
            fakultet *= i;
        }

        // Skriv ut resultatet
        System.out.println(n + "! = " + fakultet);
    }
}
