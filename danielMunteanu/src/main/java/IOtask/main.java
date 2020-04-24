package IOtask;


import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class main {
    public static void main(String[] args) throws IOException {
        String path = "danielMunteanu\\src\\main\\resources\\";
        String fileName = "wordlist.txt";
        String testWord = "shelve";
        String filePath = path + fileName;
        Utils utils = new Utils();
        utils.readFile(filePath, testWord);
        String result = utils.readFile(filePath, testWord);
        BufferedWriter writer = new BufferedWriter(new FileWriter("danielMunteanu\\src\\main\\resources\\results.txt", false));
        writer.write(result);
        writer.close();

    }
}



