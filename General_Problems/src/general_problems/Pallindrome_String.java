import java.util.*;
import java.util.Arrays;
public class Pallindrome_String {
    public static void Check(String s){
        String reverse=new StringBuffer(s).reverse().toString();
        if(s.equals(reverse))
            System.out.println("palindrome");
        else
            System.out.println("not pallindrome");
    }
    public static void main(String args[]){
        Scanner scan=new Scanner(System.in);
        System.out.println("enter string");
        String s=scan.next();
        Check(s);
    }
}
