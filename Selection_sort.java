import java.util.Scanner;
class Selection_Sort
{
    public void sort(int arr[])
    {
        for(int i=0;i<arr.length;i++)
        {
            int min_element_index=i;
            for(int j=i+1;j<arr.length;j++)
            {
                if(arr[j] < arr[min_element_index])
                {
                    min_element_index=j;
                }
            }
            int temp=arr[min_element_index];
            arr[min_element_index]=arr[i];
            arr[i]=temp;
        }
        for(int i=0;i<arr.length;i++)
        {
            System.out.print(arr[i]+" ");
        }
    }
    public static void main(String args[])
    {
        Selection_Sort obj=new Selection_Sort();
        Scanner sc=new Scanner(System.in);
        int no_of_elements=sc.nextInt();
        int arr[]=new int[no_of_elements];
        for(int i=0;i<no_of_elements;i++)
        {
            int array_element=sc.nextInt();
            arr[i]=array_element;
        }
        obj.sort(arr);
        sc.close();
    } 
}