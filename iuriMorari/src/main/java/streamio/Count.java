package streamio;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.nio.file.Path;

public class Count {

    public int wordsNioCount(String word, File file) throws IOException {
        int result = 0;
        BufferedReader bf = new BufferedReader(new FileReader(file));
        String str;
        try {
            while ((str = bf.readLine()) != null) {
                if (str.equalsIgnoreCase(word)) {
                    result++;
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            bf.close();
        }
        return result;
    }


    public int countWordInFileNIO(String word, Path path) throws IOException {
        int sum = 0;
        Reading read = new Reading();
        String[] arr = read.readFileNIO(path);
        for (int i = 0; i < arr.length; i++) {
            if (arr[i].equalsIgnoreCase(word)) {
                sum++;
            }
        }
        return sum;
    }
}