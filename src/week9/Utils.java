package week9;

import java.io.*;

public class Utils {
    public static String readContentFromFile(String path) {
        StringBuilder result = new StringBuilder("");
        try {
            File file = new File(path);
            BufferedReader reader = new BufferedReader(new FileReader(file));
            String line;
            while ((line = reader.readLine()) != null) {
                result.append(line);
                result.append("\n");
            }
            reader.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
        return result.toString();
    }

    public static void writeContentToFile(String path) {
        File file = new File(path);
        try {
            BufferedWriter writer = new BufferedWriter(new FileWriter(file));
            writer.write("fkajsdhfkhasjdfhjkasdhfjka");
            writer.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static void writeContentToFileAppend(String path) {
        File file = new File(path);
        try {
            BufferedWriter writer = new BufferedWriter(new FileWriter(file, true)); // open in append mode
            writer.write("fkajsdhfkhasjdfhjkasdhfjka");
            writer.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static File findFileNameByName(String folderPath, String fileName) {
        File file = new File(folderPath + File.separator + fileName);
        if (file.exists() && file.isFile()) {
            System.out.println(file.getName());
            return file;
        }

        return null;
    }


}
