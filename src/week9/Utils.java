package week9;

import java.io.*;

public class Utils {
    public static String readContentFromFile(String path) {
        StringBuilder result = new StringBuilder("");
        try {
            File file = new File(path);
            BufferedReader reader = new BufferedReader(new FileReader(file));
            String line;
            while ((line =reader.readLine())!= null){
                result.append(line);
                result.append("\n");
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
        return result.toString();

    }
}
