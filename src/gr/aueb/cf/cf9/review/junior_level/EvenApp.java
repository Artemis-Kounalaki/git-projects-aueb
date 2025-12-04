package gr.aueb.cf.cf9.review.junior_level;

public class EvenApp {
    public static void main() {
        int givenNumber = 5;
        boolean isEven = true;

        isEven = (givenNumber % 2 ==0) ? true: false;
        System.out.printf("The number %d is even : %b",givenNumber, isEven);
    }
}
