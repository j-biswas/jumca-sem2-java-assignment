import java.io.*;
import java.util.ArrayList;
import java.util.List;

class Student implements Serializable {
    private static final long serialVersionUID = 1L;
    
    private int roll;
    private String name;
    private double score;

    public Student(int roll, String name, double score) {
        this.roll = roll;
        this.name = name;
        this.score = score;
    }

    public int getRoll() {
        return roll;
    }

    public String getName() {
        return name;
    }

    public double getScore() {
        return score;
    }

    @Override
    public String toString() {
        return "Student{" +
                "roll=" + roll +
                ", name='" + name + '\'' +
                ", score=" + score +
                '}';
    }
}

public class StudentFile{

    public static void main(String[] args) {

        List<Student> students = new ArrayList<>();
        students.add(new Student(1, "jaidip", 85.5));
        students.add(new Student(2, "joydipta", 90.0));
        students.add(new Student(3, "Sayantan", 78.3));
 
        storeObjects(students);

        List<Student> storedStudents = readObjects();

        System.out.println("Students read from file:");
        for (Student student : storedStudents) {
            System.out.println(student);
        }
    }

    private static void storeObjects(List<Student> students) {
        try (ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("students.dat"))) {
            oos.writeObject(students);
            System.out.println("Objects stored successfully.");
        } catch (IOException e) {
            System.err.println("Error storing objects: " + e.getMessage());
        }
    }

    private static List<Student> readObjects() {
        List<Student> students = new ArrayList<>();
        try (ObjectInputStream ois = new ObjectInputStream(new FileInputStream("students.dat"))) {
            students = (List<Student>) ois.readObject();
            System.out.println("Objects read successfully.");
        } catch (IOException | ClassNotFoundException e) {
            System.err.println("Error reading objects: " + e.getMessage());
        }
        return students;
    }
}
