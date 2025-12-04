package gr.aueb.cf.cf9.ch9;

import java.io.*;
import java.nio.charset.StandardCharsets;

/**
 * Demo of the file writers
 */
public class FileWriters {

    public static void main(String[] args) {

        File file = new File("~file.txt");

        try (PrintStream ps = new PrintStream("~filepss.txt")){
           // fileWriter("~\file.txt");
           // bufferedWriter("~\file.txt");
            sayHello(System.out);
            sayHello(ps);
        } catch (IOException e) {
            e.printStackTrace();
            System.out.println("Το αρχείο δεν δημιουργήθηκε ή κάποιο λάθος συνέβη.");
        }

    }

    public static void fileWriter(String file) throws IOException{
        try(FileWriter fw = new FileWriter(file, StandardCharsets.UTF_8)){
            fw.write("Hello World");
            fw.flush();
        }catch(IOException e){
            e.printStackTrace();
            throw e;
        }
    }

    public static void bufferedWriter(String file) throws IOException {
        try (BufferedWriter bf = new BufferedWriter(new FileWriter(file, StandardCharsets.UTF_8, true))) {
            bf.write("Hello World");
            bf.newLine();
            bf.flush();
        } catch (IOException e) {
            e.printStackTrace();
            throw e;
        }
    }

    public static void printStream(File file) throws IOException{
        try (PrintStream ps = new PrintStream(file)) {
            ps.println("Hello World");
            ps.flush();
        } catch (IOException e) {
            e.printStackTrace();
            throw e;
        }
    }

    public static void printWriter(File file) throws IOException{
        try (PrintWriter pw = new PrintWriter(file)) {
            pw.println("Hello World");
            pw.flush();
        } catch (IOException e) {
            e.printStackTrace();
            throw e;
        }
    }

    public static void sayHello(PrintStream ps){
        ps.println("Hello Coding");
    }
}
