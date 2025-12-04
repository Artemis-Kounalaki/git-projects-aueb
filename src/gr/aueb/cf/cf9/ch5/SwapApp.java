package gr.aueb.cf.cf9.ch5;

/**
 * Swaps 2 numbers!
 */
public class SwapApp {
    public static void main(String[] args) {
        int a = 10;
        int b = 20;

        System.out.printf("The previews: a = %d, b = %d%n", a, b);
        swap(a,b);
        System.out.printf("The previews: a = %d, b = %d%n",a,b);
    }

        public static void swap (int a, int b) {
            int temp = a;
            a = b;
            b = temp;
        }
    }


