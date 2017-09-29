import java.util.*;

public class Quick_sort {
    public static void swap(int arr[],int i,int j){
        int temp=arr[i];
        arr[i]=arr[j];
        arr[j]=temp;
    }
    public static int Partition(int arr[],int start,int end){
        int pivot=arr[end],pindex=start;
        for(int i=start;i<end;i++){
            if(arr[i]<=pivot){
                swap(arr,i,pindex);
                pindex++;
            }
        }
        swap(arr,pindex,end);
        return pindex;
    }
    public static void quick(int arr[],int start,int end){
        if(start<end){
            int pindex=Partition(arr,start,end);
            quick(arr,start,pindex-1);
            quick(arr,pindex+1,end);
        }
    }
    public static void main(String srgs[]){
        Scanner scan=new Scanner(System.in);
        int n=scan.nextInt();
        int arr[]=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=scan.nextInt();
        }
        quick(arr,0,n-1);
        for(int i=0;i<n;i++)
            System.out.print(arr[i]+" ");
        System.out.println();
    }
}
