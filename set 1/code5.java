import java.util.*;

public class code5 {


    public static void main(String[] args) {
       String s1 = "joy";
       String s2 = "joy";
       String s3 = new String("joy");

       if (s1 == s2) System.out.println("s1 == s2");
       else System.out.println("s1 != s2");

       if(s1 == s3) System.out.println("s1 == s3");
       else System.out.println("s1 != s3");

       if(s1.equals(s3)) System.out.println("s1 equals s3");
       else System.out.println("s1 not equals s3");
        
       if(s1.equals(s2)) System.out.println("s1 equals s2");
       else System.out.println("s1 not equals s2");

    }
}