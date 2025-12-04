package gr.aueb.cf.cf9.ch3;

import java.util.Scanner;

/**
 * Ο χρήστης εισάγει έναν
 * ακέραιο που συμβολίζει μια θερμοκρασία, το πρόγραμμα
 * υπολογίζει αν η θερμοκρασία <0
 * τότε μία μεταβλητή γίνεται true ,αλλιώς false.
 */

public class TemperatureApp {
    public static void main(String[] args) {

        //Δήλωση και αρχικοποιήση μεταβλητών
        Scanner scanner = new Scanner(System.in);
        int temperature = 0;
        boolean isTempBelowZero = true;

        //Input Data
        System.out.println("Παρακαλώ να εισάγετε μια θερμοκρασία.");
        temperature = scanner.nextInt();

        //Edit data
        isTempBelowZero = temperature < 0;

        //Print results
        System.out.printf("Η θερμοκρασία είναι μικρότερη από 0: " + isTempBelowZero);

    }
}
