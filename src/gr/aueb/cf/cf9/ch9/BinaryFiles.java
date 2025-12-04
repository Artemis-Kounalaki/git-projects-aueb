package gr.aueb.cf.cf9.ch9;

import java.io.*;

public class BinaryFiles {
    static void main() {
        String inputFile = "/Users/artemiskounalake/Downloads/aueb.jpg";
        String outputFile = "/Users/artemiskounalake/Downloads/aueb-copy.jpg";

        try{
            binaryFileReadWrite(inputFile,outputFile );
        }
        catch(IOException e) {
            e.printStackTrace();
            System.out.println("Η αντιγραφή απέτυχε.");
        }
    }
    public static void binaryFileReadWrite(String inputFile, String outputFile) throws IOException{
        final int BUFFER_SIZE = 8192; //8 k
        byte [] buffer = new byte[BUFFER_SIZE];
        int bytesRead = 0;

        try(BufferedInputStream bis = new BufferedInputStream(new FileInputStream(inputFile));
            BufferedOutputStream bos = new BufferedOutputStream(new FileOutputStream(outputFile))) {
            while ( (bytesRead = bis.read(buffer)) != -1){
                bos.write(buffer, 0, bytesRead);
            }

            System.out.println("File written succesfully");
        }
        catch (IOException e){
            e.printStackTrace();
            throw e;
        }

    }
}
