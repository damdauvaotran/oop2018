package week7.task2;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class FileNotFound {
    public static void main(String[] args) {
        try {
            BufferedReader b = new BufferedReader(new FileReader("notfound.txt"));
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }
}
