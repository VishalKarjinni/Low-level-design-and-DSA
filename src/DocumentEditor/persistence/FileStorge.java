package DocumentEditor.persistence;

import java.io.FileWriter;
import java.io.IOException;

public class FileStorge implements Persistence{
    @Override
    public void save(String data) {
        try {
            FileWriter outFile = new FileWriter("document.txt");
            outFile.write(data);
            outFile.close();
            System.out.println("File Save is Done successFully");
        } catch (IOException ioException) {
            System.out.println("Error : unable to open file for writing");
        }
    }
}
