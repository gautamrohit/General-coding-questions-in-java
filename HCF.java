//import java.util.*;
import java.io.*;
public class HCF {
    public static void main(String args[])throws IOException{
        //Scanner scan=new Scanner(System.in);
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        System.out.println("enter the two number");
        String s=br.readLine();
        String []ss=s.split(",");
        int a,b;
        a=Integer.parseInt(ss[0]);
        b=Integer.parseInt(ss[1]);
        int c=a*b;
        while(a!=b){
            if(a>b)
                a=a-b;
            else
                b=b-a;
        }
        System.out.println("HCF is "+a);
        System.out.println("LCM is "+c/a);
    }
}
