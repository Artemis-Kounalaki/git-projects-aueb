package gr.aueb.cf.cf9.ch2;

import java.util.Scanner;

public class HoursToMinSec {
    public static void main(String[] args) {
        int givenHour = 0;
        int hourToMin = 0;
        int hourToSec = 0;
        final int HOUR_TO_MIN = 60;
        final int MIN_TO_SEC = 60;

        Scanner scanner = new Scanner(System.in);
        System.out.println("Δώστε την ώρα που θέλετε να μετατραπέι");
        givenHour = scanner.nextInt();
        hourToMin = givenHour * HOUR_TO_MIN;
        hourToSec = givenHour * HOUR_TO_MIN * MIN_TO_SEC;

        System.out.printf("Τα λεπτά είναι: %d και τα δευτερόλεπτα είναι: %,d", hourToMin, hourToSec);

    }
}
