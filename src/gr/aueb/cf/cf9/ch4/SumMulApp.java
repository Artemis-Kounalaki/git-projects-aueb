package gr.aueb.cf.cf9.ch4;

/**
 * Υπολογίζει και εκτυπώνει το άθροισμα και το γινόμενο
 * των δέκα πρώτων ακεραίων
 */
public class SumMulApp {
    public static void main(String[] args) {
        int mul = 1;
        int sum = 0;

        for( int i = 0; i<10; i++){
            sum += i;
            mul = mul * i;
        }
        System.out.println(sum);
        System.out.print(mul);
    }
}
