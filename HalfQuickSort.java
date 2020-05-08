import java.util.Scanner;
public class HalfQuickSort {
    public void quickSort(int [] arr)
    {
        int curr_var=arr[0];
        int i=1;
        int j=arr.length-1;
        while(i<j)
        {
            if(arr[i]>arr[0]&&arr[j]<arr[0])
            {
                int temp=arr[i];
                arr[i]=arr[j];
                arr[j]=temp;
                i+=1;
                j-=1;
            }
            else if(arr[i]<=arr[0])
            {
                i+=1;
            }
            else if(arr[j]>arr[0])
            {
                j-=1;
            }
        }
        int count=0;
        for(int x=0;x<j;x++)
        {
            if(arr[0]>arr[i])
            {
                count+=1;
            }
        }
        for(int k=1;k<=count;k++){
		    arr[k-1]=arr[k];
		}
		arr[count] = curr_var;
        for(int x=0;x<arr.length;x++)
        {
            System.out.print(arr[x]+" ");
        }
    }
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int[] arr=new int[n];
        for(int i=0;i<n;i++)
        {
            int element=sc.nextInt();
            arr[i]=element;
        }
        HalfQuickSort obj=new HalfQuickSort();
        obj.quickSort(arr);
    }
}