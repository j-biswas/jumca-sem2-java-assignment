import java.io.File;
import java.util.Scanner;

public class CheckFile {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

      
        System.out.print("Enter the filename or directory name: ");
        String filename = scanner.nextLine();

 
        File file = new File(filename);

     
        if (file.exists()) {
            
            if (file.isDirectory()) {
                System.out.println(filename + " is a directory.");
              
                String[] files = file.list();
                if (files != null && files.length > 0) {
                    System.out.println("List of files in the directory:");
                    for (String f : files) {
                        System.out.println(f);
                    }
                } else {
                    System.out.println("The directory is empty.");
                }
            } else {
                System.out.println(filename + " is a file.");
              
                if (file.canRead()) {
                    System.out.println("The file can be read.");
                } else {
                    System.out.println("The file cannot be read.");
                }
             
                if (file.canWrite()) {
                    System.out.println("The file can be written to.");
                } else {
                    System.out.println("The file cannot be written to.");
                }
            }
        } else {
            System.out.println("The file or directory does not exist.");
        }

        scanner.close();
    }
}
