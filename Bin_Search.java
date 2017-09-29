
public class Bin_Search {
    public static int bin_search(int A[], int left, int right,  int k)
    {
    int mid=0;
        while(left<=right){
             mid=left+(right-left)/2;
             if(A[mid]==k)
                return mid;
             else if(A[mid]>k)
                right=mid-1;
             else
                left=mid+1;
        }
        return -1;
    }
    public static void main(String args[]){
        int a[]={1,2,3,4,5,689,980};
        System.out.println("found at ="+bin_search(a,0,a.length-1,4));
    }
}
