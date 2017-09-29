import java.util.*;
public class Bubble_sort {
    public static int[] BubbleSort(int a[],int s){
        int temp=0;
        for(int i=0;i<s-1;i++){
            for(int j=0;j<s-i-1;j++){
                if(a[j]>a[j+1]){
                    temp=a[j];
                    a[j]=a[j+1];
                    a[j+1]=temp;
                }
            }
        }
        return a;
    }
    public static void main(String args[]){
        Scanner scan=new Scanner(System.in);
        int size=scan.nextInt();
        int a[]=new int[size];
        for(int i=0;i<size;i++){
            a[i]=scan.nextInt();
        }
        BubbleSort(a,a.length);
        for(int i=0;i<size;i++){
            System.out.print(a[i]+" ");
        }
    }
}
