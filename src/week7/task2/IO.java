package week7.task2;

import java.io.*;

public class IO {
    public static void main(String[] args) {
        try {
            BufferedReader b = new BufferedReader(new FileReader("notfound.txt"));
        } catch (IOException e) {
            System.out.println("IO exception");
        }
    }
}
