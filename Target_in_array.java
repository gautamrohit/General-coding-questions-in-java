import java.util.*;
public class Target_in_array {
    public static void main(String args[]){
        int arr[]={16,28,3,42,12,2,1};
        int k=30;
        for(int i=0;i<arr.length-1;i++){
            for(int j=i+1;j<arr.length;j++){
                if((arr[i]+arr[j])==k){
                    System.out.println(arr[i]+" "+arr[j]);
                    System.out.println(i+" "+j);
                    break;
                }
            }
        } 
    }
}
