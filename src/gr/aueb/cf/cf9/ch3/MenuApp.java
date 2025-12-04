package gr.aueb.cf.cf9.ch3;

import java.util.Scanner;

/**
 * Meny until user inserts "exit"
 */
public class MenuApp {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int choice = 0;

        do{
            System.out.println("Choose one from the above:");
            System.out.println("1. Submit Application");
            System.out.println("C2. Delete Application");
            System.out.println("3. Exit");
        } while (choice != 3);

        System.out.println("Thanks");
    }
}
