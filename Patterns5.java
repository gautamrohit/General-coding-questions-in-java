/*
1*2*3*4*17*18*19*20
--5*6*7*14*15*16
----8*9*12*13
------10*11
 */
import java.util.*;
public class Patterns5 {
    public static void main(String args[]){
        int count1=0,count2=17,c=1;
        for(int i=0;i<4;i++){
            for(int j=0;j<2*i;j++){
                System.out.print("-");
            }
            for(int k=8;k>2*i;k--){
                if(k%2==0)
                    System.out.print(++count1);
                else
                    System.out.print("*");
            }
            count2=count2-c;
            c=0;
            for(int l=7;l>i*2;l--){
                
                c++;
                if(l%2==1){                   
                    System.out.print(++count2);
                }
                else
                    System.out.print("*");
            }
            System.out.println();
        }
    }
}
