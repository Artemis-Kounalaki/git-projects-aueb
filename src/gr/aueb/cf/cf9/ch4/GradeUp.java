package gr.aueb.cf.cf9.ch4;

import java.util.Scanner;

/**
 * Λαμβάνει ένα βαθμό από τον χρ΄σητη και ανάλογα τον βαθμό εμφανίζει αντίστοιχο μήνυμα.
 */
public class GradeUp {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int grade = 0;

        System.out.println("Δώσε ένα βαθμό");
        grade = scanner.nextInt();
        switch (grade){
            case 1:
            case 2:
            case 3:
            case 4:
                System.out.println("Κάτω από τη βάση!");
                break;
            case 5:
            case 6:
                System.out.println("Καλώς!");
                break;
            case 7:
            case 8:
                System.out.println("Λίαν Καλώς!");
                break;
            case 9:
                System.out.println("Άριστα!");
                break;
            case 10:
            default:
                System.out.println("Ο βαθμός πρέπει να είναι μεταξύ 1-10!");
                break;


        }
    }
}
