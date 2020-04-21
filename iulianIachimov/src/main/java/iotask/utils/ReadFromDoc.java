package iotask.utils;

import java.io.*;
import java.nio.file.Files;
import java.nio.file.Path;

public class ReadFromDoc {
  public static String[] readBufferedFile(File file) throws IOException {
    String result = "";
    InputStream inputStream = new BufferedInputStream(new FileInputStream(file));
    byte[] buff = new byte[20000];
    int bytesRead = inputStream.read(buff);
    while (bytesRead >= 0) {
      String s = new String(buff);
      result += s;
      buff = new byte[20000];
      bytesRead = inputStream.read(buff);
      int i = 1;
    }
    inputStream.close();
    return result.split("\r\n");
  }

  public static String[] readFileNIO(Path path) throws IOException {
    String data = new String(Files.readAllBytes(path));
    return data.split("\r\n");
  }
}
