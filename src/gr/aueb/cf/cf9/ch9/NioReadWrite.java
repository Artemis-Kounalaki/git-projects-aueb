package gr.aueb.cf.cf9.ch9;

import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.StandardOpenOption;

public class NioReadWrite {
    public static void main() {
        Path source = Path.of("/Users/artemiskounalake/IdeaProjects/CF8Dev/text.txt");
        Path target = Path.of("/Users/artemiskounalake/IdeaProjects/CF8Dev/nio-hello.txt");
        try{
            textWriter(source);
            textReader(source);
            //binaryReadWrite(source,target);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    public static void textWriter(Path path) throws IOException {
        Files.createDirectories(path.getParent());
        Files.writeString(path,
                "Hello Coding",
                StandardCharsets.UTF_8,
                StandardOpenOption.CREATE,
                StandardOpenOption.APPEND);
    }

    public static void textReader(Path path) throws IOException {
            String text = Files.readString(path,
                    StandardCharsets.UTF_8);
        System.out.println(text);
        }

    public static void binaryReadWrite(Path sourcePath, Path targetPath) throws IOException {
        try (var sourceStram = Files.newInputStream(sourcePath);
             var targetStream = Files.newOutputStream(targetPath);) {
            sourceStram.transferTo(targetStream); //efficient , streaming σε chunks
        } catch (IOException e) {
            e.printStackTrace();
            throw e;
        }
    }

}
