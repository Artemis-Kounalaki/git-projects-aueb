package gr.aueb.cf.cf9.ch3;

import java.util.Locale;
import java.util.Scanner;

public class DisektoEtos {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int givenEtos = 0;
        boolean isDisekto = false;

        System.out.println("Give a year.");
        givenEtos = scanner.nextInt();

        if ( (givenEtos % 4 == 0) && (givenEtos % 100 != 0)  || (givenEtos % 400 == 0 ) ){
            isDisekto = true;
        }

        System.out.printf("The year %d is disekto :  %s", givenEtos , isDisekto);

    }
}
