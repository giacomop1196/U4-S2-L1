package es_2;

import java.util.Scanner;

public class Es2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Inserisci i chilometri percorsi: ");
        double km = scanner.nextDouble();

        System.out.print("Inserisci i litri di carburante consumati: ");
        double litri = scanner.nextDouble();

        try {
            if (litri == 0) {
                throw new ArithmeticException("Divisione per zero non valida: i litri non possono essere 0.");
            }

            double kmPerLitroDouble = km / litri;
            System.out.println("\nRisultato (double): " + kmPerLitroDouble + " km/litro");

        } catch (ArithmeticException e) {
            System.out.println("ERRORE: " + e.getMessage());
        } catch (Exception e) {
            System.out.println("ERRORE: Input non valido. Assicurati di inserire valori numerici.");
        } finally {
            scanner.close();
        }
    }
}
