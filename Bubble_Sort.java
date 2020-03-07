import java.util.Scanner;
class Bubble_Sort
{
    void Sort(int arr[])
    {
        int arr_length=arr.length;
        for(int i=0;i<arr_length-1;i++)
        {
            for(int j=0;j<arr_length-i-1;j++)
            {
               if(arr[j]>arr[j+1])
               {
                   int temp=arr[j];
                   arr[j]=arr[j+1];
                   arr[j+1]=temp;
               } 
            }
        }
        for(int i=0;i<arr_length;i++)
        {
            System.out.print(arr[i]+" ");
        }
    }
    void print_mid_element(int arr[])
    {
        int mid_element_index=arr.length/2;
        System.out.print("\n"+"The middle element in the sorted array is "+arr[mid_element_index]);
    }
public static void main(String args[]) {
    Scanner sc = new Scanner(System.in);
    int n=sc.nextInt();
    int[] arr=new int[n];
    for(int i=0;i<n;i++)
    	{
	    int arr_input=sc.nextInt();
	    arr[i]=arr_input;
	}
    Bubble_Sort obj=new Bubble_Sort();
    obj.Sort(arr);
    obj.print_mid_element(arr);
}
}
