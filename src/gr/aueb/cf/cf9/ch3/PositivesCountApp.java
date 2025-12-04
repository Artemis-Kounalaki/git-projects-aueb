package gr.aueb.cf.cf9.ch3;

import java.util.Scanner;

/**
 * As long as the user gives positive numbers the app counts them
 */
public class PositivesCountApp {
    public static void main(String[] args) {
        int number = 0;
        int positives = 0;
        Scanner scanner = new Scanner(System.in);

        System.out.println("Give a  number");
        number = scanner.nextInt();

        while (number >= 0){
            positives ++;
            System.out.println("Give a number");
            number = scanner.nextInt();
        }

        System.out.println("The positives are: " + positives);

    }
}
