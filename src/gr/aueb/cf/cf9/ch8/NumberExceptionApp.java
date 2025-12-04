package gr.aueb.cf.cf9.ch8;

import java.util.Scanner;

/**
 * to {@link NumberFormatException}
 * συμβαίνει όταν αποτυγχάνει το παρσάρισμα από IntegerParseInt
 */
public class NumberExceptionApp {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String inputStr = "";
        int num = 0;

        System.out.println("Please give a number");
        //inputStr = scanner.nextLine();

        while (!isInteger(inputStr = scanner.nextLine())) {
            System.out.println("non acceptable");
        }
        num = Integer.parseInt(inputStr);
        System.out.println("The number is: "+num);
    }
    public static boolean isInteger(String s){
        return s.matches("-?[0-9]+");
    }
}
