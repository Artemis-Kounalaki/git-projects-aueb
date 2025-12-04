package gr.aueb.cf.cf9.review.senior_level;

import java.util.Scanner;

/**
 * Rerutns the concatanation of Strings
 */

public class StrConCat {
    public static void main() {
        //Initialization
        Scanner scanner = new Scanner(System.in);
        String firstName;
        int age;
        String message;

        //Enter data, validation,
        System.out.println("Please give us your name");
        firstName = scanner.nextLine();

        System.out.println("Please enter your age");
        while (!scanner.hasNextInt()){
            System.out.println("Input valid! Give toy int age");
        }
        age = scanner.nextInt();

        //Call services
        message = strConcat(firstName,age);

        //Print results
        System.out.println(message);
    }

    /**
     *
     * @param firstName given first name
     * @param age the given age
     * @return a combined String incldes name and age
     */
    public static String strConcat(String firstName, int age){
        return String.format("Hello, my name is %s  and I am %d years old.",firstName, age );
    }
}
