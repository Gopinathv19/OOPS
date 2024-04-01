package IO;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class WordCounter {

    public static void main(String[] args) {
        if (args.length != 1) {
            System.err.println("Usage: WordCounter <filename>");
            return;
        }

        String filename = args[0];
        int wordCount = 0;

        try (BufferedReader reader = new BufferedReader(new FileReader("hello.txt"))) {
            while (reader.readLine() != null) {
                String line = reader.readLine();
                String[] words = line.split("\\s+");
                wordCount += words.length;
            }
        } catch (IOException e) {
            System.err.println("Error reading file '" + filename + "': " + e.getMessage());
            return;
        }

        System.out.println(filename + ": " + wordCount);
    }
}

