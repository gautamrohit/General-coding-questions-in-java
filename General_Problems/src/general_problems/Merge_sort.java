import java.util.*;
public class Merge_sort {
    
    public static void merge(int left[],int right[],int arr[] ){
        int i,j,k;
        i=k=j=0;
        int nl=left.length,nr=right.length;
        while(i<nl && j<nr){
            if(left[i]<=right[j]){
                arr[k]=left[i];
                i++;
                k++;
            }
            else{
                arr[k]=right[j];
                j++;
                k++;
            }
        }
        while(i<nl){
            arr[k]=left[i];
            i++;
            k++;
        }
        while(j<nr){
            arr[k]=right[j];
            j++;
            k++;
        }
    }
    public static void mergesort(int arr[]){
        if(arr.length<2)return;
        int n=arr.length/2;
        int left[]=new int[n];
        int right[]=new int[arr.length-n];
        for(int i=0;i<n;i++){
            left[i]=arr[i];
        }
        for(int i=n;i<arr.length;i++){
            right[i-n]=arr[i];
        }
        mergesort(left);
        mergesort(right);
        merge(left,right,arr);
        
    }
    public static void main(String args[]){
        Scanner scan=new Scanner(System.in);
        int n=scan.nextInt();
        int arr[]=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=scan.nextInt();
        }
        mergesort(arr);
        for(int i=0;i<n;i++)
            System.out.print(arr[i]+" ");
        System.out.println();
    }
}
