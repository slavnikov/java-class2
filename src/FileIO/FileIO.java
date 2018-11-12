package FileIO;

import java.io.FileWriter;
import java.io.IOException;

public class FileIO {
    public static void main(String[] args) throws IOException {
        FileWriter file = null;
        file = new FileWriter("test.txt");
        file.write("Hello world!");
        file.close();
    }
}
