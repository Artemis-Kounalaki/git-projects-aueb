package gr.aueb.cf.cf9.review.senior_level;
import java.util.Scanner;

/**
 * This program calculates if a number is even
 */
public class EvenApp {
    public static void main() {
        //Δήλωση και αρχικοποίηση μεταβλητών
        Scanner scanner = new Scanner(System.in);
        int givenNumber = 0;
        boolean evenRes = false;

        //Είσοδος δεδομένων, Validation και Data Binding
        System.out.println("Give a number to check if is even.");
        while (!scanner.hasNextInt()){
            System.out.println("Invalid input: Please give an integer.");
            scanner.nextLine();
        }
        givenNumber = scanner.nextInt();

        //Buisness Logic - Παραστάσεις
        evenRes = isEven(givenNumber);

        //Εκτύπωση του αποτελέσματος
        System.out.printf("The number %d is even? : %b", givenNumber, evenRes);
    }

    /**
     * Checks if a num is even
     * @param givenNumber number to check
     * @return true: even false: not even
     */
    public static boolean isEven(int givenNumber){
        boolean isEven ;

        return isEven = givenNumber % 2 == 0;
    }
}
