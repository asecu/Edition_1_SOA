package iotask.utils;

import java.io.*;
import java.nio.file.Path;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Count {
  public int countWordInFile(String word, File file) throws IOException {
    int sum = 0;
    ReadFromDoc read = new ReadFromDoc();
    String[] arr = read.readBufferedFile(file);
    for (int i = 0; i < arr.length; i++) {
      if (arr[i].equalsIgnoreCase(word)) {
        sum++;
      }
    }
    return sum;
  }

  public int countWordInFileFromString(String word, File file) throws IOException {
    int result = 0;

      BufferedReader br = new BufferedReader(new FileReader(file));
      String str;
    try {
      while ((str = br.readLine()) != null) {
        if (str.equalsIgnoreCase(word)) {
          result++;
        }
      }
    } catch (IOException e) {
      e.printStackTrace();
    } finally {
      br.close();
    }
    return result;
  }


  public int countWordInFileNIO(String word, Path path) throws IOException {
    int sum = 0;
    ReadFromDoc read = new ReadFromDoc();
    String[] arr = read.readFileNIO(path);
    for (int i = 0; i < arr.length; i++) {
      if (arr[i].equalsIgnoreCase(word)) {
        sum++;
      }
    }
    return sum;
  }

  public static String printFromMap(Path path) throws IOException {
    Map<String, ArrayList<Long>> map = new HashMap<>();
    ArrayList<Long> tmpList = new ArrayList();
    StringBuilder sb = new StringBuilder();
    try {
      File file = new File(String.valueOf(path));
      Scanner scanner = new Scanner(file);
      Long counter = 1L;
      while (scanner.hasNextLine()) {
        String nextLine = scanner.nextLine();
        if (map.containsKey(nextLine)) {
          map.get(nextLine).add(counter);
        } else {
          tmpList.add(counter);
          map.put(nextLine, new ArrayList<>(tmpList));
          tmpList.clear();
        }
        counter++;
      }
      scanner.close();
    } catch (FileNotFoundException e) {
      e.printStackTrace();
    }

    for (Map.Entry<String, ArrayList<Long>> entry : map.entrySet()) {
      sb.append(
              "Word " + entry.getKey() + " was found " + entry.getValue().size() + " time on lines: ");
      for (Long lines : entry.getValue()) {
        sb.append(lines + ",");
      }
      sb.append("\n");
    }
    return sb.toString();
  }
}
