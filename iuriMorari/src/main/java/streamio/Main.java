package streamio;

import java.io.File;
import java.io.IOException;
import java.nio.file.Path;
import java.nio.file.Paths;

import static streamio.Reading.readFileFromBuff;
import static streamio.Reading.readFileNIO;
import static streamio.Writing.writeToFile;
import static streamio.Writing.writeToFileNIO;


public class Main {
    public static void main(String[] args) throws IOException {
        File file = new File("C://Users//imarari//OneDrive - ENDAVA//Desktop//1//wordlist.txt");
        File fileout = new File("C://Users//imarari//OneDrive - ENDAVA//Desktop//1//result.txt");
        Path path = Paths.get("C://Users//imarari//OneDrive - ENDAVA//Desktop//1//wordlist.txt");
        Path pathout = Paths.get("C://Users//imarari//OneDrive - ENDAVA//Desktop//1//result.txt");
        String wordone = "shelve";
        String wordtwo = "lime";
        Count getNumber = new Count();

        readFileFromBuff(file);
        int number = getNumber.wordsNioCount(wordone, file);
        String textToPrint = "Word " + wordone + " was found " + number + " times.\n";
        writeToFile(fileout, textToPrint);

        readFileNIO(path);
        int nio = getNumber.countWordInFileNIO(wordtwo, path);
        String textToPrintnio = "Word " + wordtwo + " was found " + nio + " times.\n";
        writeToFileNIO(pathout, textToPrintnio);
    }
}