package gr.aueb.cf.cf9.ch8;

import java.time.LocalDateTime;
import java.util.Scanner;

/**
 * Η @link BankApp παρέχει μία μόνο
 * υπηρεσία της κατάθεσης
 */
public class BankApp {
    static double balance = 20.0;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double amount = 0.0;
        try{
            System.out.println("Please enter the amount");
            amount = scanner.nextDouble();
            deposit(amount);
            System.out.println("The new amount : "+balance);
    }
        catch(Exception e){
            System.out.println("NON SUCCEFUL DEPOSIT");
        }
        }

    public static void deposit(double amount) throws Exception {
        try {
            if (amount < 0) {
                throw new Exception("Amount cannot be negative");
            }
            balance += amount;
        } catch (Exception e) {
            System.err.println(LocalDateTime.now() + "\n" + e.getMessage()); //logging
            throw e; //re-throw
        }

    }
}
