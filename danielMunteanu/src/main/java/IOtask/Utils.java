package IOtask;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;

public class Utils {
    public String readFile(String filePath, String word) throws IOException {
        int wordCntr = 0;
        String result = "";
        boolean check;

        BufferedReader br = null;
        try {
            FileInputStream fstream = new FileInputStream(filePath);
            br = new BufferedReader(new InputStreamReader(fstream));
            String strLine;
            while ((strLine = br.readLine()) != null) {
                check = strLine.toLowerCase().contains(word.toLowerCase());
                if (check) {
                    String[] linewords = word.split("\\n+");
                    for (String w : linewords) {
                        {
                            String foundWord = w.trim();
                            if (word.equalsIgnoreCase(foundWord)) {
                                wordCntr++;
                            }
                        }
                    }
                    result = "word " + word + " was found " + wordCntr + " times";
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            br.close();
        }
        return result;
    }
}
