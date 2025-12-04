package gr.aueb.cf.cf9.ch3;

import java.util.Scanner;

public class Menu2App {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int choice = 0;

        while (true){
            System.out.println("Choose one from the above:");
            System.out.println("1. Submit Application");
            System.out.println("C2. Delete Application");
            System.out.println("3. Exit");
            choice = scanner.nextInt();
            if (choice == 3){
            break;}
        }

        System.out.println("Thanks");
    }
}
