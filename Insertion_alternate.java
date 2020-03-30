import java.util.Scanner;
class Insertion_sort
{
    void sort(int arr[])
    {
        for(int i=1;i<arr.length;i++)
        {
            int value=arr[i];
            int x=i+1;
            while(x<arr.length&& arr[x]<value)
            {
                arr[x-1]=arr[x];
                x=x+1;
            }
            arr[x-1]=value;
        }
    }
    void print(int arr[])
    {
        for(int i=0;i<arr.length;i++)
        {
            System.out.print(arr[i]+" ");
        }
    }
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int[] arr=new int[n];
        for(int i=0;i<n;i++)
        {
            int arr_input=sc.nextInt();
            arr[i]=arr_input;
        }
        Insertion_sort obj=new Insertion_sort();
        obj.sort(arr);// Time Complexity of this Sorting is O(n^2)
        obj.print(arr);// Space Complexity of this Sorting is constant which means O(1)
    }
}