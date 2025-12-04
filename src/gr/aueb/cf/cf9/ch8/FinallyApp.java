package gr.aueb.cf.cf9.ch8;

import java.util.InputMismatchException;
import java.util.Scanner;

public class FinallyApp {
    public static void main(String[] args) {
        //Scanner scanner = new Scanner(System.in);
        int num = 0;
        System.out.println("Give a number");

//        try{
//            num = scanner.nextInt();
//            System.out.println("Num: "+num);
//        }
//        catch(InputMismatchException e){
//            System.err.println("Error: "+e.getMessage());
//            e.printStackTrace();
//        }
//        finally{
//            try {
//                if (scanner != null) {
//                    scanner.close();
//                }
//            }
//                catch(Exception e){
//                    System.err.println("Error: "+e.getMessage());
//                    e.printStackTrace();
//                }
//
//        }

        try (Scanner scanner = new Scanner(System.in)){
            num = scanner.nextInt();
            System.out.println("Num: "+num);
        }catch(InputMismatchException e){
            System.err.println("Error: "+e.getMessage());
            e.printStackTrace();
        }
        }
}
