import java.util.Scanner;
public class QuickSort {
    public static int[] quicksort(int []a,int l,int r){
        if(l<r){
            int pivot=a[l];
            int i = r;
            int j = r;
            for(;j>l;j--){
                if(pivot<a[j]){
                    int temp=a[i];
                    a[i]=a[j];
                    a[j]=temp;
                    i--;
                }
            }
            int temp=a[i];
            a[i]=a[j];
            a[l]=temp;
            quicksort(a,l,i-1);
            quicksort(a,i+1,r);
        }
        return a;
    }
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int l=0;
        int r=n-1;
        int[] arr=new int[n];
        for(int i=0;i<n;i++)
        {
            int element=sc.nextInt();
            arr[i]=element;
        }
        QuickSort obj=new QuickSort();
        int[] x=obj.quicksort(arr,l,r);
        for(int i=0;i<n;i++){
            System.out.print(x[i]+" ");
        }
    }
}

//Time Complexity is O(n^2) in worst case
//Space Complexity is O(n) in worst case
