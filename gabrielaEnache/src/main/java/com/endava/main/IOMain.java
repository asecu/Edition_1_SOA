package com.endava.main;

import java.io.File;
import java.nio.file.Path;

import static com.endava.io.FileUtils.countWordInFile;
import static com.endava.io.FileUtils.createNewFile;
import static com.endava.io.FileUtils.getFileFrom;
import static com.endava.io.FileUtils.getLineNumberFor;
import static com.endava.io.FileUtils.writeToFile;
import static com.endava.io.NIOFileUtils.countWordInFile;
import static com.endava.io.NIOFileUtils.createFile;
import static com.endava.io.NIOFileUtils.getFilePath;
import static com.endava.io.NIOFileUtils.writeInFile;

public class IOMain {
    public static void main(String[] args) {
        String PATH = "gabrielaEnache/src/main/resources/";
        String INPUT_FILE_NAME = "wordlist.txt";
        String RESULT = "result.txt";
        String RESULT1 = "result1.txt";

        File inputFile = getFileFrom(PATH + INPUT_FILE_NAME);
        File outputFile = createNewFile(PATH, RESULT);
        String message = "shelve was found " + countWordInFile("shelve", inputFile) + " times\n";
        String bonusMessage = "shelve was found " + countWordInFile("shelve", inputFile) + " times on lines:" +
                getLineNumberFor("shelve", inputFile);
        writeToFile(message + bonusMessage, outputFile);

        Path inputPath = getFilePath(PATH + INPUT_FILE_NAME);
        Path outputPath = createFile(PATH, RESULT1);
        String message1 = "shelve was found " + countWordInFile("shelve", inputPath) + " times\n";
        writeInFile(message1, outputPath);


    }
}
