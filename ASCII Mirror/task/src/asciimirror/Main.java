package asciimirror;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        String cow  = """
                                    _______\s
                                   <  >
                                    -------\s
                            ^__^   /       \s
                    _______/(oo)  /        \s
                /\\/(       /(__)           \s
                   | w----||               \s
                   ||     ||               \s
                """;

        String cow1 = """
                            ^__^
                    _______/(oo)
                /\\/(       /(__)
                   | w----||   \s
                   ||     ||   \s""";

        Scanner sc = new Scanner(System.in);
        System.out.println("input the file path:");
        String input = sc.nextLine();
        File f = new File(input);

        try(Scanner scanner = new Scanner(f)) {
            while(scanner.hasNextLine()) {
                String line = scanner.nextLine();
                System.out.println(line);
            }
        }catch(FileNotFoundException e) {
            System.out.println("File not found");

        }
    }
}