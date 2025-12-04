package gr.aueb.cf.cf9.ch2;

import java.util.Scanner;

/**
 * O xrhsths dinei thn hlikia tou se eth kai to programma epistrefei thn hlikia se hmeres
 * opoy theoroume oti ena etos =365 hmeres
 * Gia px an douei 20 etvn hlikia to apotelesma einai 7300 hmeres
 */
public class YearsToDays
{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        final int DAYS_IN_YEAR = 365;
        int inputAgeYears = 0;
        int ageInDays = 0;

        System.out.println("Παρακαλώ εισάγετε την ηλικία σας");
        inputAgeYears = scanner.nextInt();
        ageInDays = inputAgeYears * DAYS_IN_YEAR;

        System.out.printf("Ηλικία σε έτη: %d, Ηλικία σε ημέρες: %,d %n", inputAgeYears, ageInDays);
    }
}
