
public class code8 {

    public String name; // Name of the student
    public int roll; // Roll number of the student
    public int score; // Score of the student

    // Constructor with name, roll, and score parameters
    public code8(String name, int roll, int score) {
        this.name = name;
        this.roll = roll;
        this.score = score;
    }

    // Constructor with name and roll parameters
    public code8(String name, int roll) {
        this.name = name;
        this.roll = roll;
    }

    // Constructor with roll parameter
    public code8(int roll) {
        this.roll = roll;
    }

    // Default constructor
    public code8() {
    };

    // Copy constructor
    public code8(code8 obj) {
        this(obj.name, obj.roll, obj.score);
    }

    // Method to display the attributes of the object
    public void displayAttributes() {
        System.out.println("Name: " + name);
        System.out.println("Roll: " + roll);
        System.out.println("Score: " + score);
    }

    // Method to copy the attributes of one object to another
    public void copyTo(code8 otherObj) {
        otherObj.name = this.name;
        otherObj.roll = this.roll;
        otherObj.score = this.score;
    }

    public static void main(String[] args) {

        // Creating objects and displaying their attributes
        code8 obj1 = new code8("joydipta", 10, 50);
        obj1.displayAttributes();
        code8 obj2 = new code8("name1", 3, 353);
        obj2.displayAttributes();
        code8 obj3 = new code8("name2", 4);
        obj3.displayAttributes();
        code8 obj4 = new code8(3);
        obj4.displayAttributes();
        code8 obj5 = new code8();
        obj5.displayAttributes();

        System.out.println("copy_fn");

        // Copying attributes of obj1 to obj2 using copyTo method
        obj1.copyTo(obj2);
        obj2.displayAttributes();

        System.out.println("copy_cons");

        // Creating obj6 using copy constructor
        code8 obj6 = new code8(obj1);
        obj6.displayAttributes();

        // Assigning obj1 to obj7
        code8 obj7 = obj1;
        obj7.displayAttributes();

        // Modifying the name attribute of obj1 and displaying attributes of obj7
        obj1.name = "changed";
        obj7.displayAttributes();
    }

}