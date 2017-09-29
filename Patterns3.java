
public class Patterns3 {
    public static void main(String args[]){
        for(int i=10;i>=1;i--){
            for(int j=i-1;j>=1;j--){
                System.out.print("   ");
            }
            for(int k=10;k>=i;k--){
                System.out.print(" * ");
            }
            System.out.println();
        }
    }
}
