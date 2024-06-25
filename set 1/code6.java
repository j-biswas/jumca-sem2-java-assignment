import java.util.*;

public class code6 {
    public static void show(int num) {
        System.out.println("int passed: " + num);
    }

    public static void show(double num) {
        System.out.println("double passed: " + num);
    }

    public static void main(String[] args) {
        short shortValue = 10;
        show(shortValue);

        double doubleValue = 3.14;
        show(doubleValue);
    }
}
