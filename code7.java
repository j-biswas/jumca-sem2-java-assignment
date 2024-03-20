import java.util.*;

public class code7{
    private String name;
    private int roll;
    private int score;
    
    public code7(String name, int roll,int score) {
        this.name = name;
        this.roll = roll;
        this.score = score;
    }
    
    public void displayAttributes() {
        System.out.println("Name: " + name);
        System.out.println("Roll: " + roll);
        System.out.println("Score: "+ score);

    }
    
    public void copyTo(code7 otherObj) {
        otherObj.name = this.name;
        otherObj.roll = this.roll;
        otherObj.score = this.score;
    }

    public static void main(String[] args) {

        code7 obj1 = new code7("joydipta", 10,50);
        obj1.displayAttributes();
        code7 obj2 = new code7("name1", 3,353);
        obj2.displayAttributes();
        obj1.copyTo(obj2);
        obj2.displayAttributes();
    }
}

