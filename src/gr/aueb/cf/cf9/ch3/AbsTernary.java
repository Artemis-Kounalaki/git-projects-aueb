package gr.aueb.cf.cf9.ch3;

import java.util.Scanner;

/**
 * Υπολογιζει την τιμή ενός ακεραίου με την
 * χρήση του διαδικού τελεστή Το απόλυτο ενός ακεραίου
 * είναι θετικός ριθμός.Για παράδειγμα το απόλυτο του -5 είναι 5.
 */
public class AbsTernary {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int givenNumber = 0;
        int abs = 0;

        System.out.println("Give a number to find out its absent value.");
        givenNumber = scanner.nextInt();

        abs = (givenNumber >= 0 ) ? givenNumber : -givenNumber;
        System.out.printf("The absent value os %d , the absent value %d", givenNumber, abs);
    }
}
