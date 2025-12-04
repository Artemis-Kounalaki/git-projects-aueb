package gr.aueb.cf.cf9.ch2;
import java.util.Scanner;

public class MyEx1 {
    public static void main(String[] args) {
        int num1 = 0;
        int num2 = 0;
        int num3 = 0;
        Scanner scanner = new Scanner(System.in);

        System.out.println("Give three numbers one for day from 1-31, one from month 1-12 and one for year until 2025");
        num1 = scanner.nextInt();
        num2 = scanner.nextInt();
        num3 = scanner.nextInt();

        System.out.printf("Date is %02d / %02d /%d",num1, num2, num3);
    }
}
