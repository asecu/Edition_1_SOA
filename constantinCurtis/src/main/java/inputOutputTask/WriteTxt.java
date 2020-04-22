package inputOutputTask;


import java.io.*;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.StandardOpenOption;

public class WriteTxt {
    public static void writeToDoc(File file, String text) throws IOException {
        OutputStream out;
        try {
            out = new BufferedOutputStream(new FileOutputStream(file, true));
            out.write(text.getBytes());
            out.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static void writeNio(String message, Path path) throws IOException {
        try {
            Files.write(path, message.getBytes(), StandardOpenOption.APPEND);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}