package es_1;

import java.util.Random;
import java.util.Scanner;
import java.util.Arrays;

public class Es1 {
    public static void main(String[] args) {


        int[] numbers = new int[5];
        Random random = new Random();

        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = random.nextInt(10) + 1; // Valori tra 1 e 10
        }
        System.out.println("Array iniziale: " + Arrays.toString(numbers));

        // Scanner
        Scanner scanner = new Scanner(System.in);

        int inputNumber;

        do {
            try {
                // Chiedere all'utente il numero e la posizione
                System.out.print("\nInserisci un numero da aggiungere (0 per uscire): ");
                inputNumber = scanner.nextInt();

                if (inputNumber == 0) {
                    System.out.println("Programma terminato.");
                    break;
                }

                System.out.print("Inserisci la posizione (indice) dove inserire il numero (0-4): ");
                int position = scanner.nextInt();

                numbers[position] = inputNumber;
                System.out.println("Array aggiornato: " + Arrays.toString(numbers));
            } catch (ArrayIndexOutOfBoundsException e) {
                System.out.println("ERRORE: La posizione inserita non è valida. L'indice deve essere tra 0 e 4.");
            } catch (Exception e) {
                System.out.println("ERRORE: Input non valido. Inserisci solo numeri interi.");
                scanner.next(); // Pulisce lo scanner
            }

        } while (true);

        scanner.close();
    }
}