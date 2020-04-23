package com.endava.io;

import java.io.BufferedReader;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class NIOFileUtils {
    public static Path getFilePath(String pathToFile) {
        return Paths.get(pathToFile);
    }

    public static int countWordInFile(String word, Path path) {
        int result = 0;
        try (BufferedReader reader = Files.newBufferedReader(path)) {
            String line;
            while ((line = reader.readLine()) != null) {
                if (line.equalsIgnoreCase(word)) {
                    result++;
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        return result;
    }

    public static Path createFile(String path, String filename) {
        Path directory = Paths.get(path);
        return directory.resolve(filename);
    }

    public static void writeInFile(String message, Path path) {
        try {
            Files.write(path, message.getBytes());
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
