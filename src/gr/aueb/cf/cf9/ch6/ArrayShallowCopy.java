package gr.aueb.cf.cf9.ch6;

/**
 * όταν κανουμε copy references τότε το copy
 * ονομάζεεται shallow και εχει side effects
 */
public class ArrayShallowCopy {
    public static void main(String[] args) {
        int[] array1 = {1,2,3,4,5};
        int[] array2 = array1;
        array2[0] = 1000;
        System.out.println(array1[0]);

    }
    public static int[] getArrayDeepCopy(int[] arr){
        int[] destinationArr = new int[arr.length];

        for(int i=0; i<= arr.length; i++) {
            System.out.println();
        }
    return arr;
    }
}
