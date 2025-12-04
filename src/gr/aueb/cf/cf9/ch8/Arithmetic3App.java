package gr.aueb.cf.cf9.ch8;

import java.util.Scanner;

public class Arithmetic3App {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num1 = 0;
        int num2 = 0;
        int result = 0;

        while(true){
            System.out.println("Give 2 numbers: ");
            num1 = scanner.nextInt();
            if(num1 == 0) break;

            num2 = scanner.nextInt();
            if(num2 == 0) {
                System.out.println("Ο παρανομαστής δεν μπορεί να είναι 0.");
                continue;
            }

            result = num1 / num2;
            System.out.println("Result: " +result);
        }
    }
}
