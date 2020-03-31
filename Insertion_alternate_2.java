import java.util.Scanner;
class Insertion_sort
{
    void sort(int arr[])
    {
        int current,slidingvalue,nsv,i,j;
		for(i=arr.length-2;i>=0;i--) {					
			current = arr[i];
			j=arr.length-1;
			while(arr[j]>current&&j>i) { 		
				j--;
			}
			slidingvalue = arr[j];
			arr[j] = current;
			j--;
			while(j>=i) {					
				nsv = arr[j];
				arr[j] = slidingvalue;
				slidingvalue = nsv;
				j--;
			}
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