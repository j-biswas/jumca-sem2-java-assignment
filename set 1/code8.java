import java.util.*;

public class code8 {

    public String name;
    public int roll;
    public int score;

    public code8(String name, int roll, int score) {
        this.name = name;
        this.roll = roll;
        this.score = score;
    }

    public code8(String name, int roll) {
        this.name = name;
        this.roll = roll;
    }

    public code8(int roll) {
        this.roll = roll;
    }

    public code8() {
    };

    public code8(code8 obj) {
        this(obj.name, obj.roll, obj.score);
    }

    public void displayAttributes() {
        System.out.println("Name: " + name);
        System.out.println("Roll: " + roll);
        System.out.println("Score: " + score);

    }

    public void copyTo(code8 otherObj) {
        otherObj.name = this.name;
        otherObj.roll = this.roll;
        otherObj.score = this.score;
    }

    public static void main(String[] args) {

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
        obj1.copyTo(obj2);
        obj2.displayAttributes();

        System.out.println("copy_cons");
        code8 obj6 = new code8(obj1);
        obj6.displayAttributes();

        code8 obj7 = obj1;
        obj7.displayAttributes();

        obj1.name="changed";
        obj7.displayAttributes();
    }

}