import java.util.*;
public class Small_odd_factor {
    public static void main(String args[]){
        Scanner scan=new Scanner(System.in);
        int a=scan.nextInt();
        for(int i=2;i*i<a;i+=1){
            if(a%i==0 && i%2!=0){
                System.out.println(i);
                
            }
        }
    }
}
