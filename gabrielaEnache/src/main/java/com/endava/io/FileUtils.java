package com.endava.io;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.LineNumberReader;
import java.util.ArrayList;
import java.util.List;

public class FileUtils {
    public static File getFileFrom(String pathToFile) {
        return new File(pathToFile);
    }

    public static int countWordInFile(String word, File file) {
        int result = 0;
        try {
            BufferedReader reader = new BufferedReader(new FileReader(file));
            String line;
            while ((line = reader.readLine()) != null) {
                if (line.equalsIgnoreCase(word)) {
                    result++;
                }
            }
            reader.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
        return result;
    }

    public static File createNewFile(String path, String filename) {
        return new File(path + filename);
    }

    public static void writeToFile(String message, File file) {
        try {
            BufferedWriter writer = new BufferedWriter(new FileWriter(file));
            writer.write(message);
            writer.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static List<Integer> getLineNumberFor(String word, File file) {
        List<Integer> result = new ArrayList<>();
        try {
            LineNumberReader reader = new LineNumberReader(new FileReader(file));
            String line;
            while ((line = reader.readLine()) != null) {
                if (line.equalsIgnoreCase(word)) {
                    result.add(reader.getLineNumber());
                }
            }
            reader.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
        return result;
    }
}
