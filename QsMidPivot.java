import java.util.Scanner;
public class QsMidPivot {
	void quickSort(int[] arr, int low, int high) {
        if (low>=high)
        {
           return;
        }
	int middle=low+(high-low)/2;
	int pivot = arr[middle];
        int i=low;;
        int j = high;
		while (i<=j) {
			while (arr[i]<pivot) {
				i++;
			}
			while (arr[j]>pivot) {
				j--;
			}
			if (i<=j) {
				int temp = arr[i];
				arr[i] = arr[j];
				arr[j] = temp;
				i++;
				j--;
			}
		}
		if (low<j)
			quickSort(arr, low, j);
		if (high>i)
			quickSort(arr, i, high);
    }
    void print(int arr[])
    {
          for(int i=0;i<arr.length;i++)
        {
            System.out.print(arr[i]+" ");
        }
    }
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int l=0;
        // Integer x=0;
        int r=n-1;
        int[] arr=new int[n];
        for(int i=0;i<n;i++)
        {
            int element=sc.nextInt();
            arr[i]=element;
        }
        QsMidPivot obj=new QsMidPivot();
        // var obj1=new QsMidPivot();
        obj.quickSort(arr,l,r);
        obj.print(arr);
    }
}
//Time complexity of this program is O(n^2)
//Space Complexity used here is O(n) 
