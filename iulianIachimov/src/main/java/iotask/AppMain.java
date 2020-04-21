package iotask;

import iotask.utils.Count;
import iotask.utils.WriteToDoc;

import java.io.File;
import java.io.IOException;
import java.nio.file.Path;
import java.nio.file.Paths;

import static iotask.utils.ReadFromDoc.readBufferedFile;
import static iotask.utils.ReadFromDoc.readFileNIO;
import static iotask.utils.WriteToDoc.writeToFile;
import static iotask.utils.WriteToDoc.writeToFileNIO;

public class AppMain {
  public static void main(String[] args) throws IOException {
    File file = new File("iulianIachimov//src/main//resources//wordlist.txt");
    File fileout = new File("iulianIachimov//src//main//resources//results.txt");
    File mapout = new File("iulianIachimov//src//main//resources//resfrommap.txt");
    Path path = Paths.get("iulianIachimov//src//main//resources//wordlist.txt");
    Path pathout = Paths.get("iulianIachimov//src//main//resources//results.txt");
    WriteToDoc writeToDoc = new WriteToDoc();
    String wordone = "shelve";
    String wordtwo = "lime";
    Count getNumber = new Count();

    readBufferedFile(file);
    int number = getNumber.countWordInFileFromString(wordone, file);
    String textToPrint = "Word " + wordone + " was found " + number + " times.\n";
    writeToFile(fileout, textToPrint);

    readFileNIO(path);
    int numbernio = getNumber.countWordInFileNIO(wordtwo, path);
    String textToPrintnio = "Word " + wordtwo + " was found " + numbernio + " times.\n";
    writeToFileNIO(pathout, textToPrintnio);
    
    writeToDoc.writeFromMap(mapout, Count.printFromMap(path));
  }
}
