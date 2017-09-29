
public class Patterns4 {
    public static void main(String args[]){
        for(int i=1;i<=10;i++){
            for(int j=i;j>1;j--){
                System.out.print("   ");
            }
            for(int k=i;k<=10;k++){
                System.out.print(" * ");
            }
            System.out.println();
        }
    }
}
