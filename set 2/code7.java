import java.util.Scanner;
import java.util.StringTokenizer;

public class code7 {
    public static void main(String[] args) {
      
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a string:");
        String inputString = scanner.nextLine();
        scanner.close();


        int countA = 0;
        for (int i = 0; i < inputString.length(); i++) {
            if (inputString.charAt(i) == 'a') {
                countA++;
            }
        }
        System.out.println("Number of times 'a' appears: " + countA);

  
        int countAnd = 0;
        int index = inputString.indexOf("and");
        while (index != -1) {
            countAnd++;
            index = inputString.indexOf("and", index + 1);
        }
        System.out.println("Number of times 'and' appears: " + countAnd);

        
        boolean startsWithThe = inputString.startsWith("The");
        System.out.println("Starts with 'The': " + startsWithThe);

   
        char[] charArray = inputString.toCharArray();
        for(char c: charArray)
        {
            System.out.println(c);
        }
        
        StringTokenizer tokenizer = new StringTokenizer(inputString, " @.");
        System.out.println("Tokens in the string:");
        while (tokenizer.hasMoreTokens()) {
            System.out.println(tokenizer.nextToken());
        }
    }
}


