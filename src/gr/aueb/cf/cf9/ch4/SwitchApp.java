package gr.aueb.cf.cf9.ch4;

import java.util.Scanner;

/**
 * Αναλογα τι επιλογει ο χρήστης εκτυπωνει το πεογραμμα
 */
public class SwitchApp {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int choice = 0;
        final int EXIT = 4;

        System.out.println("Επιλέξτε ένα από τα ακόλουθα");
        choice = scanner.nextInt();
        switch (choice){
            case 1:
                System.out.println("epilogh 1");
                break;
        }
    }
}
