package iotask.utils;

import java.io.*;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.StandardOpenOption;

public class WriteToDoc {
  public static void writeToFile(File file, String text) throws IOException {
    try {
      OutputStream outputStream = new BufferedOutputStream(new FileOutputStream(file, true));
      outputStream.write(text.getBytes());
      outputStream.close();
    } catch (IOException e) {
      e.printStackTrace();
    }
  }

  public static void writeToFileNIO(Path path, String text) throws IOException {
    try {
      Files.write(path, text.getBytes(), StandardOpenOption.APPEND);
    } catch (IOException e) {
      e.printStackTrace();
    }
  }

  public static void writeFromMap(File file, String st) throws IOException {
    FileWriter fw = null;
    try {
      fw = new FileWriter(file);
      fw.write(st);
    } catch (IOException e) {
      e.printStackTrace();
    } finally {
      fw.close();
    }

  }
}
