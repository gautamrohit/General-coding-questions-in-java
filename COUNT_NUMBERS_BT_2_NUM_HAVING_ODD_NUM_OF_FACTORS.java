import java.util.*;
public class COUNT_NUMBERS_BT_2_NUM_HAVING_ODD_NUM_OF_FACTORS {
    public static void main(String args[]){
        Scanner scan=new Scanner(System.in);
        int a=scan.nextInt();
        int b=scan.nextInt();
        int count=(int)Math.sqrt(b)-(int)Math.sqrt(a-1);
        System.out.println(count);
    }
}
