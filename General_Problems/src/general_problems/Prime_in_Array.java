import java.util.*;
public class Prime_in_Array {
    public static void main(String args[]){
        Scanner scan=new Scanner(System.in);
        int a[]={133,34,323,445,566,119,1,24,19,13};
        int sum=0;
        for(int i=0;i<a.length;i++){
            boolean bool=false;
            for(int j=2;j<=a[i]/2;j++){
                if(a[i]%j==0){
                    bool=true;
                }
            }
            if(bool==false){
                System.out.print(a[i]+" ");
                sum+=a[i];
            }
        }
        System.out.println();
        System.out.println("sum is "+sum);
    }
}
