package gr.aueb.cf.cf9.ch2;
import java.util.Scanner;

public class KiloToGrams {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        final int KILOS_TO_GRAM = 1000;
        int kilos = 0;
        int kilos_to_grams = 0;

        System.out.println("Πληκτρολογήστε το βάρος σας σε κιλά");
        kilos= scanner.nextInt();
        kilos_to_grams = kilos * KILOS_TO_GRAM;

        System.out.printf("Το βαρος σε κιλά είναι: %d , Το βάρος σε γραμμάρια: %,d", kilos, kilos_to_grams);
    }
}
