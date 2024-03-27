
import java.util.*;     

class Instructor {
    private String name;
    private String phoneNumber;

    public Instructor(String name, String phoneNumber) {
        this.name = name;
        this.phoneNumber = phoneNumber;
    }

    public void setInfo(String name, String phoneNumber) {
        this.name = name;
        this.phoneNumber = phoneNumber;
    }

    public String viewInfo() {
        return "Instructor Name: " + name + ", Phone Number: " + phoneNumber;
    }
}

class Textbook {
    private String title;
    private String author;
    private String publisher;

    public Textbook(String title, String author, String publisher) {
        this.title = title;
        this.author = author;
        this.publisher = publisher;
    }

    public void setData(String title, String author, String publisher) {
        this.title = title;
        this.author = author;
        this.publisher = publisher;
    }

    public String viewData() {
        return "Textbook Title: " + title + ", Author: " + author + ", Publisher: " + publisher;
    }
}

class Course {
    private String courseName;
    private Instructor instructor;
    private Textbook textbook;

    public Course(String courseName, Instructor instructor, Textbook textbook) {
        this.courseName = courseName;
        this.instructor = instructor;
        this.textbook = textbook;
    }

    public void setCourseData(String courseName, Instructor instructor, Textbook textbook) {
        this.courseName = courseName;
        this.instructor = instructor;
        this.textbook = textbook;
    }

    public String viewCourseData() {
        return "Course Name: " + courseName + "\n" + instructor.viewInfo() + "\n" + textbook.viewData();
    }
}

public class code11 {
    public static void main(String[] args) {
        Instructor in = new Instructor("jaidip", "987654321");
        System.out.println(in.viewInfo());

        Textbook tb = new Textbook("how to java", "joy", "isbn");
        System.out.println(tb.viewData());

        Course ch = new Course("java programming", in, tb);
        System.out.println(ch.viewCourseData());

    }

}