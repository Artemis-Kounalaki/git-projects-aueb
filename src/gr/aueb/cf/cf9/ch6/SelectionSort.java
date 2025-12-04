package gr.aueb.cf.cf9.ch6;

public class SelectionSort {
    public static void main(String[] args) {
        int[] arr = {12,11,13,5,6};
        System.out.println("Before sorting: ");
        printArray(arr);
        System.out.println();
        System.out.println("After sorting: ");
        printArray(selectionArray(arr));


    }

    public static int[] selectionArray(int[] arr){
        int minPosition = 0;
        int minValue = 0;
        for( int i = 0; i < arr.length-1; i++){

            minPosition = i;
            minValue = arr [minPosition];

            for (int j = i +1; j< arr.length;j++){
                if(arr[j] <minValue){
                    minPosition = j;
                    minValue = arr[j];
                }
            }
//swap to min me to i
            swap(arr, minPosition, i);
        }
        return arr;
    }

    public static void swap(int[] arr, int i, int j){
        int tmp = arr[i];
        arr[i] = arr[j];
        arr[j] = tmp;
    }

    public static void printArray( int[] arr) {
        for (int item : arr) {
            System.out.print(item + " ");
        }
    }

}
