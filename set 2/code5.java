import java.util.*;

class InvalidScoreException extends Exception {
    public InvalidScoreException(String message) {
        super(message);
    }
}

class Student {
    private int roll;
    private String name;
    private int score;

    public Student(int roll, String name) {
        this.roll = roll;
        this.name = name;
    }

    public void setScore(int score) {
        try {
            if (score < 0 || score > 100)
                throw new InvalidScoreException("Invalid score: " + score);

            this.score = score;
        } catch (InvalidScoreException e) {
            System.out.println("Error: " + e);
        }
    }

    public int getRoll() {
        return roll;
    }

    public String getName() {
        return name;
    }

    public int getScore() {
        return score;
    }
}

public class code5 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter student ID: ");
        int id = scanner.nextInt();
        scanner.nextLine(); // Consume newline
        System.out.print("Enter student name: ");
        String name = scanner.nextLine();

        Student student = new Student(id, name);

        System.out.print("Enter student score: ");
        int score = scanner.nextInt();
        student.setScore(score);

        scanner.close();
    }

}
