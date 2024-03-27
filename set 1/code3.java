import java.util.*;

public class code3 {
    public static void main(String[] args) {
        var h_cm = 0.0;
        System.out.println("enter height in cm  : ");
        Scanner sc = new Scanner(System.in);
        h_cm = sc.nextDouble();
        System.out.println("height : "+ Math.floor(h_cm/30.5)+" feet "+ ((h_cm % 30.5)/2.54 )+" inch");

    }
}