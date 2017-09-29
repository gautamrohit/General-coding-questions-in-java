import java.util.*;
public class Binary_search {
    public static int BinaryS(int arr[],int i,int j,int k){
        if(j>=i){
            int p=(i+j)/2;
            if(arr[p]==k)
                return p;
            if(k<arr[p])
                return BinaryS(arr,i,p-1,k);
            else
                return BinaryS(arr,p+1,j,k);
        }
        return -1;
    }
    public static void main(String args[]){
        Scanner scan=new Scanner(System.in);
        int arr[]={0,2,5,8,9,12,16,44,55,83};
        System.out.println("enter the number for searching");
        int a=scan.nextInt();
        System.out.println(BinaryS(arr,0,arr.length-1,a));
    }
    
}
