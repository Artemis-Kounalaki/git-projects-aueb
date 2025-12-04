package gr.aueb.cf.cf9.ch6;

public class AddOneApp {
    public static void main(String[] args) {
        int[] ar1 = {2000};
        printArray(addOne(ar1));

    }
    public static int[] addOne(int[] arr){
        if (arr == null) return new int[0];

        int[] returnedSum = new int[arr.length+1];
        int carry = 1;
        int sum = 0;

        for (int i=arr.length-1; i>0 ; i--){
            sum = arr[i] +carry;
            returnedSum[i+1] = sum % 10;
            carry = sum / 10;
        }
        if (carry == 1){
            returnedSum[0] = 1;
        }
        return returnedSum;
    }
    public static void printArray( int[] arr) {
        for (int item : arr) {
            System.out.print(item + " ");
        }
    }
}
