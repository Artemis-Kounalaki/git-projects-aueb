package gr.aueb.cf.cf9.review.challenges;

import java.util.Scanner;

/**
 * Ένας αριθμός armstrong είναι ένας ακέραιος που ισούται
 * με το άθροισμα των ψηφίων του όπου το κάθε ψηφίο είναι υψωμένο
 * στη δύναμη του αριθμού των ψηφίων π.χ. 153 = 1^3 + 5^3 + 3^3 = 153
 */
public class Armstrong {
    public static void main() {
        Scanner scanner = new Scanner(System.in);
        int num = 0;
        System.out.println("Give a number");
        num = scanner.nextInt();
        System.out.printf("IS num %d armStrong ?  %b", num, isArmstrong(num));
    }
    public static boolean isArmstrong(int initialNum){
        int numLength = String.valueOf(initialNum).length();
        int [] numArray = new int[numLength];
        int digit = 0;
        int sum = 0;

        int num = initialNum;
        while(num!=0){
            digit = num % 10;
            sum += (int) Math.pow(digit,numLength);
            num /= 10;
        }
        return sum == initialNum;
    }
}

