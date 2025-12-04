package gr.aueb.cf.cf9.ch6;

import java.util.Scanner;

public class ArraySearch {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int[] arr = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        int value = 0;
        int position = 0;

        System.out.println("Give a position to search for:");
        value = scanner.nextInt();

        position = getPosition(arr, value);

        if (position == -1) {
            System.out.println("Value not found");
        } else {
            System.out.println("Value: " + value + " , position: " + (position + 1));
        }
    }

        /**
         * Επιστρέφει τη θέση ενός στοιχείου στον πίνακα
         * , αν δεν υπάρχει επιστρέφει -1
         * @param arr input πινακασ
         * @param value
         * @return
         */
        public static int getPosition ( int[] arr, int value){
            if (arr == null) return -1;
            int positionToReturn = -1;
            for (int i = 0; i < arr.length; i++) {
                if (arr[i] == value) {
                    positionToReturn = 1;
                    break;
                }
            }
            return positionToReturn;
        }
    }

