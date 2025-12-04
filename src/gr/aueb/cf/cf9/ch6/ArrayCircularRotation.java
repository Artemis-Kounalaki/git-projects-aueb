package gr.aueb.cf.cf9.ch6;

public class ArrayCircularRotation {
    public static void main(String[] args) {

        int[] ar1 = {1,5,71,9};
        int[] ar2 = shiftRightBy(ar1,3);
        printArray(ar2);

    }

    public static int[] shiftRightBy(int[] arr, int offset){
        if(arr == null) return new int[0];
        if(offset <0) return new int[0];
        int[] rotated = new int[arr.length];
        for (int i=0; i<arr.length; i++){
            rotated[(i+offset) % arr.length] = arr[i];
        }
        return rotated;
    }

    public static void printArray( int[] arr) {
        for (int item : arr) {
            System.out.print(item + " ");
        }
    }
}
