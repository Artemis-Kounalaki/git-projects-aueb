package gr.aueb.cf.cf9.ch2;
import java.util.Scanner;

/**
 * Λαμβάνει ένα ποσό σε ευρώ και το μετατρέπει σε δολάρια ΗΠΑ
 * με βάση μια ισοτιμία. Για παράδειγμα αν ο χρήστης δώσειι 100 ευρώ και η ισοτιμία είναι
 * 1 ευρώ = 99 USA cents
 * Τότε συνολικά είναι 9.990 ευρώ και 99 USD και 0 cents.
 */

public class EurosToUsdConverter {

    public static void main(String[] args) {

        //Δήλωση και αρχικοποίηση μεταβλητών
        Scanner scanner = new Scanner(System.in);
        int inputEuros = 0;
        final int EUROS_TO_DOL_RATE = 99;
        int dollarsUsa = 0;
        int centsUsa = 0;

        //Data input from the user
        System.out.println("Δώσε ένα ποσό σε ευρώ για μετατροπή σε δολάρια.");
        inputEuros = scanner.nextInt();

        //Data processing
        dollarsUsa = ((inputEuros * EUROS_TO_DOL_RATE)/100) ;
        centsUsa = (inputEuros * EUROS_TO_DOL_RATE) % 100  ;

        //Data output
        System.out.printf("Έδωσες %d ευρώ και αυτα ειναι %d δολάρια και %d cents.",inputEuros, dollarsUsa, centsUsa);


    }

}
