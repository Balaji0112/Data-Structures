public class Quick3Sort {
    public static int[] quick3(int[] arr, int start, int end) {
        int i = end; 
        int j = end;
        int x = start;
		int pivot = arr[start];
		while(x<=i) {
			if(arr[i]==pivot) {
				i--;
			}
			else if(arr[i]<pivot) {
				int temp = arr[x];
				arr[x] = arr[i];
				arr[i] = temp;
				x+=1;
			}
			else {
				int temp = arr[i];
				arr[i] = arr[j];
				arr[j] = temp;
                i-=1;
                j-=1;
			}
		}
		if(start<x-1)
			quick3(arr,start,x-1);
		if(j+1<end)
			quick3(arr,j+1,end);
		return arr;
    }
    
    public static void main(String[] args) {
        int[] arr = {168,179,181,120,142,204};
        int len=arr.length;
        quick3(arr,0,len-1);
		for(int i=0;i<len;i++) 
			System.out.print(arr[i]+" ");
    }
}
//Time Complexity is O(n^2) in worst case
//Space Complexity is O(n) in worst case
