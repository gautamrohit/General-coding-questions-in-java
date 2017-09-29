import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class ARRA_OP_MAX {
    public static void fun(int arr[], int a,int b, int k){
        for(int i=a-1;i<=b-1;i++){
            arr[i]=arr[i]+k;
        }
    }
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int m = in.nextInt();
        int arr[]=new int[n];
        
        for(int a0 = 0; a0 < m; a0++){
            int a = in.nextInt();
            int b = in.nextInt();
            int k = in.nextInt();
            fun(arr,a,b,k);
        }
        System.out.println(Arrays.stream(arr).max().getAsInt());
        in.close();
    }
}
