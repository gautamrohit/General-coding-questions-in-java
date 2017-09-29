import java.util.*;
import java.math.*;

public class Binary2Decimal {
    public static void main(String args[]){
        int a,i=0;
        
        Scanner scan=new Scanner(System.in);
        a=scan.nextInt();
        int b=a;
        do {
            i++;
            System.out.println(a%10);
            a=a/10;
        }while(a!=0);
        int arr[]=new int[i];
        i=0;
        do {
            arr[i]=b%10;
            b=b/10;
            i++;
        }while(b!=0);
        int z=0;
        for(int j=0;j<arr.length;j++){
            if(arr[j]==1)
                z+=Math.pow(2, j);
            else
                z+=0;
        }
        System.out.print(z);
    }
    
}
