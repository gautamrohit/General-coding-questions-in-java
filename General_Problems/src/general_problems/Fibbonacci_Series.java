import java.util.*;
public class Fibbonacci_Series {
        public static void main(String args[]){
        Scanner scan=new Scanner(System.in);
        int a=0,b=1,c;
        int n;
        System.out.println("enter the length of series");
        n=scan.nextInt();
        System.out.print(a +" "+b);
        for(int i=0;i<n-2;i++){
            c=a+b;
            a=b;
            b=c;
            System.out.print(" "+c);
        }
        System.out.println();
    }
}
