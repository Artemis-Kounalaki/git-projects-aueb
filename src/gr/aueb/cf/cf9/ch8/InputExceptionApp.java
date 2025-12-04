package gr.aueb.cf.cf9.ch8;

import javax.script.ScriptEngine;
import java.util.Scanner;

/**
 * TO {@ink InputMissMatchException συμβαλινει όταν ο Scanner
 * αποτυγχάνει να διαβάσει  σωστό τύπο δεδομένων}
 */
public class InputExceptionApp {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num = 0;

        System.out.println("Please enter one int: ");
        //num = scanner.nextInt();
        while (!scanner.hasNextInt()){
            System.out.println("Not acceptable");
            scanner.nextLine();
        }

        System.out.println("Num:" +num);
    }
}
