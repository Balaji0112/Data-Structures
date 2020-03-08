import java.util.Scanner;
class Bubble_Sort
{
    void Sort(int arr[])
    {
        for(int i=0;i<=arr.length/2;i++)
        {
            for(int j=0;j<arr.length-i-1;j++)
            {
               if(arr[j]>arr[j+1])
               {
                   int temp=arr[j];
                   arr[j]=arr[j+1];
                   arr[j+1]=temp;
               } 
            }
        }
        System.out.print("The middle element after sorting is: "+arr[arr.length/2]);
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
}
}
