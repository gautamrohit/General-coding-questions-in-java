import java.util.*;
public class Prime_Number {
    public static void main(String args[]){
        Scanner scan=new Scanner(System.in);
        System.out.println("enter the numebr ");
        int a=scan.nextInt();
        boolean bool=false;
        for(int i=2;i<=a/2;i++){
            if(a%i==0){
                bool=true;
                break;
            }
        }
        if(bool==true)
            System.out.println("not prime");
        else
            System.out.println("prime");
    }
}
