import java.util.*;

public class Factors_of_number {
    public static void main(String args[]){
        Scanner scan=new Scanner(System.in);
        int n=scan.nextInt();
        List ls=new ArrayList();
        for(int i=1;i<=Math.sqrt(n);i++){
            if(n%i==0){
                ls.add(i);
                //System.out.println(i);
                if(i!=n/i){
                    ls.add(n/i);
                    //System.out.println(n/i);
                }
            }
        }
        
        System.out.println(ls);
        Collections.sort(ls);
        System.out.println(ls);
    }
}
