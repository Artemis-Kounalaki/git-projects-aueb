package gr.aueb.cf.cf9.ch8;

public class NpeApp {
    public static void main(String[] args) {
        String s;

        s = getOneOrNUll();

        if(s == null){
            System.out.println("s is null"); //state-test
            return;
        }
        System.out.println(s.length());
    }

    public static String getOneOrNUll(){
        return null;
    }
}
