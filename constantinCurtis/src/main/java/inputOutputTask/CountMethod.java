package inputOutputTask;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.stream.Stream;

public class CountMethod {
    public static int countMethod(String word, File file) throws IOException {
        int result = 0;

        BufferedReader bufRead = new BufferedReader(new FileReader(file));
        String str;
        while ((str = bufRead.readLine()) != null) {
            if (str.equalsIgnoreCase(word)) {
                result++;
            }
        }
        System.out.println("Word " + word + " was found " + result + " times.\n");
        return result;
    }

    public static int countNio(String word, Path path) throws IOException {
        Stream<String> lines = Files.lines(Paths.get("Edition_1_SOA//constantinCurtis//src//main//resources//wordlist.txt"));
        return (int) lines.parallel().filter(str -> str.contains("Abstracted".toLowerCase())).count();
    }
}



