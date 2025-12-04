package gr.aueb.cf.cf9.review.senior_level;

import java.util.Scanner;

/**
 * Calculates the max element of a given number
 */
public class ArrayMax {
    static void main() {
        //Initialization
        Scanner scanner = new Scanner(System.in);
        final int SIZE = 5;
        int[] givenArr = new int[SIZE];
        int maxPosition = 0;
        int maxValue = 0;

        //Give data, validation, data binding
        System.out.println("Give 5 elements of an array");
        for ( int i=0; i<SIZE ; i++){
            while(! scanner.hasNextInt()){
                System.out.println("Invalid Input. Give an integer.");
                scanner.nextLine();
            }
            givenArr [i] = scanner.nextInt();
        }

        //Call methods
        maxPosition = findMaxPosition(givenArr);
        maxValue = givenArr[maxPosition];

        //Print
        System.out.println("The maximum value of the given array is "+maxValue);
    }

    /**
     * Finds the position of the maximun array value
     * @param arr  Given array
     * @return the position of  max value
     */
    public static int findMaxPosition(int[] arr){
        if (arr == null || arr.length ==0) return Integer.MIN_VALUE;
        int maxPosition = 0;
        int maxValue = arr[maxPosition];

        for (int i=0; i<arr.length ; i++){
            if(arr[i]>maxPosition){
                maxPosition = i;
                maxValue = arr[i];
            }
        }
        return maxPosition;
    }
}
