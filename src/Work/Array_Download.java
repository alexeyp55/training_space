package Work;

import java.io.*;
import java.util.*;

public class Array_Download {                        // класс, загружающий массив слов в ArrayList
    //public static String[] word = new String[3];   // изначальный массив данных

    public static List<String> word = new ArrayList<>();

    public static void arrayDownload() throws FileNotFoundException {
        File file = new File("words");

        Scanner scanner = new Scanner(file);

        while (scanner.hasNextLine()) {
            word.add(scanner.nextLine());
        }
        scanner.close();
    }
}