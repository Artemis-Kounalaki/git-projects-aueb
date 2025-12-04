package gr.aueb.cf.ch7;

/**
 * Μία μέθοδος να παίρνει 2 string s1, s2
 * και να ελέγχει αν το ένα είναι αναγραμματισμός του άλλου.
 * πχ "listen: silent", ίδιο πλήθος και ίδια γράμματα
 */
public class Anagrams {
    public static void main(String[] args) {
        String s1 = "listen";
        String s2 = "silent";
        System.out.println(isAnagram(s1,s2));
    }
    public static boolean isAnagram(String s1, String s2) {
        if (s1.length() != s2.length()) return false;
        int[] frequency = new int[256];
        for (char c : s1.toCharArray()) {
            frequency[c]++;
        }
        for (char c : s2.toCharArray()) {
            frequency[c]--;
            if (frequency[c] < 0) return false; //early exit
        }
        for (int item : frequency) {
            if (item != 0) return false;
        }
        return true;
    }
}

