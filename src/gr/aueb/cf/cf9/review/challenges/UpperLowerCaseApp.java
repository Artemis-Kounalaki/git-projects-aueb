package gr.aueb.cf.cf9.review.challenges;

import java.util.Scanner;

/**
 * Δοθέντος ενός string μετρατρέπει
 * σε καφαλαίο - πεζά εναλλάξ
 */
public class UpperLowerCaseApp {
    public static void main() {
        Scanner scanner = new Scanner(System.in);
        StringBuilder sb = new StringBuilder();
        String inputStr ;
        char ch = ' ';

        //input data
        System.out.println("Εισάγετε ένα string.");
        inputStr = scanner.nextLine();

        //Buisness
        for(int i=0; i<inputStr.length(); i++){
            ch = inputStr.charAt(i);
            if(Character.isLetter(ch)){
                ch = i  % 2 == 0 ? Character.toUpperCase(ch) : Character.toLowerCase(ch);
                sb.append(ch);
            }
        }
        System.out.println(sb);
    }
}
