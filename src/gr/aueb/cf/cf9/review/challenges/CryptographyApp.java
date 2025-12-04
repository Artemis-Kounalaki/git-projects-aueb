package gr.aueb.cf.cf9.review.challenges;

/**
 * Η κρυπτογράφηση βασίζεται σε μετατροπή
 * των χαρακτήρων σε ακέραιο
 */
public class CryptographyApp {
    public static void main() {
        String s = "Coding Facroty#";
        final int KEY = 256;
        System.out.println(chipher(s,KEY));
        System.out.println(dichipher(chipher(s,KEY),KEY));
    }


    public static String chipher(String s, int key){
        int prvChifer ;
        int chifer ;
        StringBuilder chipherArray = new StringBuilder();

        prvChifer = s.charAt(0);
        chipherArray.append(prvChifer);
        chipherArray.append(" ");
        for (int i=1; i<s.length(); i++){
            if(s.charAt(i)=='#') {
                chipherArray.append("-1");
                break;
            }
            else{
                chifer = (s.charAt(i) + prvChifer) % key;
                chipherArray.append(chifer);
                chipherArray.append(" ");
                prvChifer = chifer;
            }
        }
        return chipherArray.toString();
    }

    public static String dichipher (String s, int key){
        StringBuilder dichipherArray = new StringBuilder();
        String[] tokens = s.split(" ");
        char dichipher ;
        int chipher;

        int preChipher = Integer.parseInt(tokens[0]);
        dichipher = (char) preChipher;
        dichipherArray.append(dichipher);

        for (int i=1; i<tokens.length; i++){
            if(tokens[i].equals(-1)){
                dichipherArray.append("#");
                break;
            }
            chipher = Integer.parseInt(tokens[i]);
            dichipher = (char) ((chipher - preChipher + key) % key);
            dichipherArray.append(dichipher);
            preChipher = dichipher;
        }
        return dichipherArray.toString();
    }
}
