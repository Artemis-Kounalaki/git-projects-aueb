package gr.aueb.cf.cf9.ch9;

import java.io.*;
import java.nio.charset.StandardCharsets;

public class FileReadersJavaIo {
    public static void main(String[] args) {
        File file = new File("~filepss.txt");
        try{
            bufferedReader(file);
        }
        catch(IOException e) {
            e.printStackTrace();
            System.out.println("Το αρχείο δεν δημιουργήθηκε ή κάποιο λάθος συνέβη.");
        }

        }

    public static void fileReader(String file) throws IOException{
        try(FileReader fr = new FileReader(file, StandardCharsets.UTF_8)){
            int byteRead = 0;
            while ( (byteRead = fr.read()) != 1){
                System.out.println((char) byteRead);
            }
        }catch (IOException e){
            e.printStackTrace();
            throw e;
        }
    }

public static void bufferedReader(File file) throws IOException {
    try (BufferedReader br = new BufferedReader(new FileReader(file))) {
        String line;
        while ((line = br.readLine()) != null) {
            System.out.println(line);
        }
    }
}

}

