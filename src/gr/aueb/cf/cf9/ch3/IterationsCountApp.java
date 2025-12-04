package gr.aueb.cf.cf9.ch3;

import java.util.Scanner;

/**
 * Count the number of iterations as long as
 * the user not inserts -1
 */
public class IterationsCountApp {
    public static void main(String[] args) {
        int number = 0;
        int iterations = 0;
        Scanner scanner = new Scanner(System.in);

        System.out.println("Give a  number");
        number = scanner.nextInt();

        while (number != -1){
            iterations ++;
            System.out.println("Give a number");
            number = scanner.nextInt();
        }

        System.out.println("The positives are: " + iterations);

    }

}
