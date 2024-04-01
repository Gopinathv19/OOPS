package IO;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class linecounter {

    public static void main(String[] args)
     {

        for (String filename : args) {
            try (BufferedReader reader = new BufferedReader(new FileReader("C:\\Users\\gopin\\OneDrive\\Desktop\\OOPS\\IO\\hello.txt"))) {
                int lineCount = 0;
                while (reader.readLine() != null) {
                    lineCount++;
                }
                System.out.println("The number of lines in the file \""  + "\" is: " + lineCount);
            } catch (IOException e) {
                System.err.println("Error reading file '" + filename + "': " + e.getMessage());
            }
        }
    }
}

