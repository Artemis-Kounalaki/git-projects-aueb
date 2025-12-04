package gr.aueb.cf.cf9.ch3;

import java.util.Scanner;

/**
 * The user inserts the temperatutre in Celcious
 * and the status of isRaining variable
 * and calculates if it is snowing or not.
 * If it isRaining and the temperature is below zero then is snowing.
 */
public class SnowingApp {
    public static void main(String[] args) {

    Scanner scanner = new Scanner(System.in);
    int temperature = 0;
    boolean isRaining = false;
    boolean isSnowing = false;

    System.out.println("Insert if it is raining. (true/false)");
    isRaining = scanner.nextBoolean();
    System.out.println("Please insert the temperature");
    temperature = scanner.nextInt();

    isSnowing = (isRaining == true) && (temperature < 0) ;

    System.out.println("It is snowing? " + isSnowing);





    }
}
