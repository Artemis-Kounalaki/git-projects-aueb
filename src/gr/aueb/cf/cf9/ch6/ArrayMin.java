package gr.aueb.cf.cf9.ch6;

/**
 * Βρίσκει το μικρότερο στοιχείο ενός πίνακα
 */
public class ArrayMin {
    public static void main(String[] args) {

    }


public static int getMinPosition(int[] arr){
    if(arr ==null || arr.length == 0 ) return -1;
    int minPosition = 0;
    int minValue = arr[minPosition];

    for (int i=1
         ; i<arr.length;i++){
        if(arr[i]<minValue){
            minPosition = i;
            minValue = arr[i];
        }
    }
    return minPosition;
}
}