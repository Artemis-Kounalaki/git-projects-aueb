package gr.aueb.cf.ch7;

/**
 * Παλινδρομική είναι η πρόταση που διαβάζεται το ίδιο
 * και απο τις 2 φορές.
 */
public class Palindrome {
    public static void main(String[] args) {
        String str = "a d a";
        System.out.println(isPalindrom(str));
        System.out.println(isPalindrom2(str));

    }

    public static boolean isPalindrom(String str) {
        boolean isPalindrome = true;
        for (int i = 0, j = str.length()-1; i < j; i++, j--) {
                if (str.charAt(i) != str.charAt(j)) return false;
            }
        return true;
    }

    public static boolean isPalindrom2(String str) {
        return new StringBuilder(str).reverse().toString().equals(str);
    }

}
