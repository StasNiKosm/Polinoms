package readerFile;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class Reader {

    private String path;

    public Reader(String path) {
        this.path = path;
    }

    public String read() {
        if (path == null) {
            System.out.println("variable path equals null");
            return null;
        }
        try {
            BufferedReader br = new BufferedReader(new FileReader(path));
            return br.readLine();
        } catch (FileNotFoundException e) {
            throw new RuntimeException("File not found. " + e);
        } catch (IOException e) {
            throw new RuntimeException("IO exception. " + e);
        }

    }

}
