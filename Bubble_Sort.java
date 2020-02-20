class Sort
{
    void Bubble_Sort(int arr[])
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
public static void main(String args[]) {
    Sort obj=new Sort();
    int arr[]={168,179,181,120,142,204};
    obj.Bubble_Sort(arr);
}
}