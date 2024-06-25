import java.util.Scanner;

public class code1 {
    private static int sharedVariable = 0;
    
    public static void main(String[] args) throws InterruptedException {
        Scanner scanner = new Scanner(System.in);
        
        for (int i = 0; i < 10; i++) { // Repeat the experiment several times
            System.out.print("Enter increment amount: ");
            int incrementAmount = scanner.nextInt();
            final int decrementAmount = 10; // Fixed decrement amount

            Thread incrementThread1 = new Thread(() -> increment(incrementAmount));
            Thread incrementThread2 = new Thread(() -> increment(incrementAmount));
            Thread decrementThread1 = new Thread(() -> decrement(decrementAmount));
            Thread decrementThread2 = new Thread(() -> decrement(decrementAmount));

            incrementThread1.start();
            incrementThread2.start();
            decrementThread1.start();
            decrementThread2.start();

            incrementThread1.join();
            incrementThread2.join();
            decrementThread1.join();
            decrementThread2.join();

            System.out.println("Final value of shared variable: " + sharedVariable);
            
            // Reset shared variable for next iteration
            sharedVariable = 0;
        }
        
        scanner.close();
    }

    private static synchronized void increment(int amount) {
        sharedVariable += amount;
    }

    private static synchronized void decrement(int amount) {
        sharedVariable -= amount;
    }
}
