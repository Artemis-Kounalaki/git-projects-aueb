package gr.aueb.cf.ch7;

public class LetterCount {
    public static void main(String[] args) {

        String s1 = "Atheeena";
        char c = 'e';
        System.out.println(letterCount(s1,c));
    }

    public static int letterCount(String str, char c){
        int count = 0;
        for(int i=0; i<str.length(); i++){
            if (str.charAt(i)== c ){
                count++;
            }
        }
        return count;
    }
}
