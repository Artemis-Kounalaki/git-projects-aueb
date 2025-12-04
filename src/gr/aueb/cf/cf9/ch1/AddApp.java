package gr.aueb.cf.cf9.ch1;

/**
 * Προσθέτει δύο ακεραίους και εμφανίζει το αποτέλεσμα στην κονσόλα .
 */
public class AddApp {
    public static void main(String[] args) {
        //Δήλωση και αρχικοποιήση μεταβλητών
        int num1 = 500_000;
        int num2 = 10_000;
        int result = 0;

        //Εντολές
        result = num1 + num2;

        //Εκτύπωση αποτελέσματος
        System.out.println("The result is: " + result);
        System.out.println("The sum of: " + num1 + ", " +num2 + " is: " +result);
        System.out.printf("Το άθροισμα των: %,d, %,d είναι: %,d\n", num1, num2, result);

    }
}
