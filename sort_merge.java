import java.util.Scanner;
public class sort_merge {
	void sort_array(int[] arr1, int[] arr2)  
	{
	    int temp[]=new int[arr1.length+arr2.length];
	    int i=0,j=0,k=0; 
	    while(i<arr1.length&&j<arr2.length) 
	    {
	        if(arr1[i]>arr2[j])  
	        {
	            temp[k++]=arr2[j++]; 
	        }
	        else
	        {
	            temp[k++]=arr1[i++];
	        }
	    }
	    while(i>=arr1.length&&j<arr2.length) 
	    {
	        temp[k++]=arr2[j++]; 
	    }
	    while(j>=arr2.length&&i<arr1.length) 
	    {
	        temp[k++]=arr1[i++];
        }
        System.out.println( );
        for(int x=0;x<temp.length;x++)
        {
            System.out.print(temp[x]+" ");
        }   
	}
    public static void main(String[] args)  
	{
        sort_merge obj=new sort_merge();
        Scanner sc=new Scanner(System.in);
        int no_of_elements_1=sc.nextInt();
        int no_of_elements_2=sc.nextInt();
        int arr1[]=new int[no_of_elements_1];
        int arr2[]=new int[no_of_elements_2];
        for(int i=0;i<no_of_elements_1;i++)
        {
            int array_element=sc.nextInt();
            arr1[i]=array_element;
        }
        for(int i=0;i<no_of_elements_2;i++)
        {
            int array_element=sc.nextInt();
            arr2[i]=array_element;
        }
		obj.sort_array(arr1,arr2);
		sc.close();
    }
}


