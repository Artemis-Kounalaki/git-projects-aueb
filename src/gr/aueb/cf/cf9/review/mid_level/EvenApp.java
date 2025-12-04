package gr.aueb.cf.cf9.review.mid_level;

public class EvenApp {
    public static void main() {
        //Scanner scanner = new Scanner("Give a number to check if is even.");
        int num = 10;
        boolean result = isEven(num);
        System.out.println(result);
    }
    public static boolean isEven(int givenNumber){
        boolean isEven ;
        return isEven = (givenNumber % 2 == 0) ? true : false;
    }
}
