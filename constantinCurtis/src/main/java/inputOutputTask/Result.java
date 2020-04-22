package inputOutputTask;

import java.io.File;
import java.io.IOException;
import java.nio.file.Path;

import static inputOutputTask.CountMethod.countMethod;
import static inputOutputTask.CountMethod.countNio;
import static inputOutputTask.WriteTxt.writeNio;
import static java.nio.file.Paths.get;


public class Result {
    public static void main(String[] args) throws IOException {
        File readFromTxt = new File("Edition_1_SOA//constantinCurtis//src//main//resources//wordlist.txt");
        File writeResultIo = new File("Edition_1_SOA//constantinCurtis//src//main//resources//Result");

        String findWordIo = "Shelve";
        String findWordNio = "Abstracted";

        Path wordPath = get("Edition_1_SOA//constantinCurtis//src//main//resources//wordlist.txt");
        Path resultPath = get("Edition_1_SOA//constantinCurtis//src/main//resources//Result");

        //IO reading and writing to result txt
        int quantIo = countMethod(findWordIo, readFromTxt);
        String textPrintIo = "Word " + findWordIo + " was found " + quantIo + " times.\n";

        WriteTxt writeToText = new WriteTxt();
        writeToText.writeToDoc(writeResultIo, textPrintIo);

        //Nio reading and writing to result txt
        int quantNio = countNio(findWordNio, wordPath);

        String textPrintNio = "NIO:Word " + findWordNio + " was found " + quantNio + " times.\n";
        writeNio(textPrintNio, resultPath);
    }
}
