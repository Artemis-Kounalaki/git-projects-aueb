package gr.aueb.cf.cf9.ch3;

/**
 * Prints 10 starts horizontically
 */

public class Stars10 {
    public static void main(String[] args) {

        int numberRate = 1;
        int j = 10;
        while(numberRate <= 10){
            System.out.print("*");
            numberRate ++;
        }

        while(j>=1){
            System.out.print("*");
            j--;
        }

    }

}
