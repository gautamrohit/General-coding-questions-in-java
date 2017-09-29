import java.util.*;
public class Count_primes {
    public static void count(int a){
        boolean bool=false;
        for(int i=2;i<=a/2;i++){
            if(a%i==0){
                bool=true;
                break;
            }
        }
        if(bool==false)
            System.out.print(a+" ");
    }
    public static void main(String args[]){
        Scanner scan=new Scanner(System.in);
        System.out.println("enter the numebr ");
        int b=scan.nextInt();
        
        for(int j=1;j<=b;j++){
            count(j);
        }
        
    }
}
