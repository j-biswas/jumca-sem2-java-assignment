import java.util.*;

public class code4 {
    static final float PI = 3.14;

    public static void main(String[] args) {
        System.out.println("Enter radius : ");
        Scanner sc = new Scanner(System.in);
        var r = sc.nextDouble();

        System.out.println("Area : " + (PI * r * r));
    }
}