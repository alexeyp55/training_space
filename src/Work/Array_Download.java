package Work;

import java.io.*;
import java.util.*;

public class Array_Download {
    public static String[] word = new String[3];   // изначальный массив данных

    public static void arrayDownload() throws FileNotFoundException {
        File file = new File("words");

        Scanner scanner = new Scanner(file);
        int i = 0;

        while (scanner.hasNextLine()) {
            word[i] = scanner.nextLine();
            i++;
        }

        //System.out.println(Arrays.toString(word));
        scanner.close();
    }
}