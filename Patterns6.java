/*
17*18*19*20
14*15*16
12*13
11
*/
public class Patterns6 {
    public static void main(String args[]){
        int count=16,c=0;
        for(int i=1;i<=4;i++){
            count=count-c;
            c=0;
            for(int j=7;j>=2*i-1;j--){
                c++;
                if(j%2==1)
                    System.out.print(++count);
                else
                    System.out.print("*");
            }
            System.out.println();
        }
    }
}
