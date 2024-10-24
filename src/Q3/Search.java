package Q3;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class Search {
    public static void main(String[] args) {
        if (args.length < 2) {
            System.out.println("Usage: java Search <word> <file1> <file2> ... <fileN>");
            return;
        }

        String searchWord = args[0];

        for (int i = 1; i < args.length; i++) {
            String filename = args[i];
            try (BufferedReader reader = new BufferedReader(new FileReader(filename))) {
                String line;
                while ((line = reader.readLine()) != null) {
                    if (line.contains(searchWord)) {
                        System.out.println(filename + ": " + line);
                    }
                }
            } catch (IOException e) {
                System.err.println("Error reading file " + filename + ": " + e.getMessage());
            }
        }
    }
}