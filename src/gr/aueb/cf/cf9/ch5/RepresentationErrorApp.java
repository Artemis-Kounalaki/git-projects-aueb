package gr.aueb.cf.cf9.ch5;

public class RepresentationErrorApp {
    public static void main(String[] args) {
        double actual = 0.0;
        double expected = 0.0;

        for (int i=0; i<=10; i++)
        {
            actual = actual + 0.1;
        }
        System.out.println("actual: "+actual);
    }
}
