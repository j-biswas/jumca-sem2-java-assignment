import java.io.*;
import java.util.Scanner;

public class code4 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String filename = "text.txt";

      
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(filename))) {
            System.out.println("Enter names to be written to the file (type '#' to stop):");
            while (true) {
                String name = scanner.nextLine();
                if (name.equalsIgnoreCase("#")) {
                    break;
                }
                writer.write(name);
                writer.newLine();
            }
            System.out.println("Names have been written to " + filename);
        } catch (IOException e) {
            System.out.println("An error occurred while writing to the file: " + e.getMessage());
        }

     
        try (BufferedReader reader = new BufferedReader(new FileReader(filename))) {
            String line;
            System.out.println("\nContents of " + filename + ":");
            while ((line = reader.readLine()) != null) {
                System.out.println(line);
            }
        } catch (IOException e) {
            System.out.println("An error occurred while reading from the file: " + e.getMessage());
        }

        scanner.close();
    }
}
