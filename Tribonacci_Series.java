import java.util.*;
public class Tribonacci_Series {
    public static void main(String args[]){
        Scanner scan=new Scanner(System.in);
        int a=0,b=1,c=1,d;
        System.out.println("enter the length of series");
        int n=scan.nextInt();
        System.out.print(a +" "+b+" "+c);
        for(int i=0;i<n-3;i++){
            d=a+b+c;
            a=b;
            b=c;
            c=d;
            System.out.print(" "+d);
        }
        System.out.println();
    }
}
