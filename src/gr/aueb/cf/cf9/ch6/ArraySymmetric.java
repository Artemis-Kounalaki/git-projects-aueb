package gr.aueb.cf.cf9.ch6;

/**
 * Συμμετρικός πίνκας, διαβάζεται και από
 * τισ δύο πλευρές το ίδιο [1,2,3,2,1]
 */
public class ArraySymmetric {
    public static void main(String[] args) {
        int[] ar = {1,2,2,3,2,1};
        System.out.println(isSymmetric(ar));
    }

    public static boolean isSymmetric(int[] arr) {
        boolean isSymmetric = true;
        int arLen = arr.length-1;
            for (int i = 0; i < arr.length / 2; i++) {
                //for(int i=0, j=arr.length-1 ;i<j; i++, j--;)
                if (arr[i] != arr[arLen - i]) {
                    isSymmetric = false;
                    break;
                }
                isSymmetric = true;
            }
            return isSymmetric;
        }
    }

