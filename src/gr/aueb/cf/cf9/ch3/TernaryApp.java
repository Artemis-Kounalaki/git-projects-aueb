package gr.aueb.cf.cf9.ch3;

import java.util.Scanner;

/**
 * Computes the smaller number of 2 given
 */
public class TernaryApp {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num1 = 0;
        int num2 = 0;
        int min = 0;

        System.out.println("Give 2 numbers");
        num1 = scanner.nextInt();
        num2 = scanner.nextInt();

        min = (num1 < num2) ? num1 : num2;

        System.out.println("The min is: "+min);
    }
}

