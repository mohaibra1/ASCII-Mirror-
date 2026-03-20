package asciimirror;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Input the file path:");
        String filePath = input.nextLine();

        File file = new File(filePath);

        if (!file.exists() || file.isDirectory()) {
            System.out.println("File not found!");
            return;
        }

        List<String> lines = new ArrayList<>();

        try (Scanner fileScanner = new Scanner(file)) {
            while (fileScanner.hasNextLine()) {
                lines.add(fileScanner.nextLine());
            }
        } catch (FileNotFoundException e) {
            System.out.println("File not found!");
            return;
        }

        // Find the max line length
        int maxLength = 0;
        for (String line : lines) {
            if (line.length() > maxLength) {
                maxLength = line.length();
            }
        }

        for (String line : lines) {
            String padded = String.format("%-" + maxLength + "s", line);
            //String mirrored = mirrorReverse(padded);
            System.out.println(padded + " | " + padded);
        }
    }

}
