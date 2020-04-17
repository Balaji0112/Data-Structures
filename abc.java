public class abc
{
	public static void main(String[] args)   /// O(m+n) 
	{
	    int input1[] = { 1,3 };
	    int input2[] = {2,4,6,8, 10, 12, 14, 16, 18, 20, 22, 24 };
	    int[] mergedArray = shivamerge(input1,input2);
	    
	    for (int i = 0; i < mergedArray.length; i++)
        {
            System.out.println(mergedArray[i]);
        } 
	    
	}
	
	static int[] shivamerge(int[] a, int[] b)  
	{
	    int m = a.length;
	    int n = b.length;
	    int output[] = new int[m+n];
	    
	    int i = 0, j = 0, k = 0;
	    
	    while( i < m && j < n) 
	    {
	        if( a[i] > b[j])  
	        {
	            output[k++] = b[j++]; 
	        }
	        else
	        {
	            output[k++] = a[i++];
	        }
	    }
	    while( i >= m && j < n) 
	    {
	        output[k++] = b[j++]; 
	    }
	    while( j >= n && i < m) 
	    {
	        output[k++] = a[i++];
	    }
	    return output;
	}
}

