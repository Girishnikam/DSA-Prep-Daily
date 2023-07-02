//O(n)
/* class ReverseArray
{
	public static void main(String args[])
	{
		int arr[]={5,4,3,2,1,0};

		for(int i=0;i<6;i++)
			System.out.print(" "+arr[i]);

		System.out.println("\n");

		for(int i=arr.length-1; i>=0;i--)
			System.out.print(" "+arr[i]);	
	}
} 
*/

class ReverseArray
{
	static void reversearr(int arr[], int size)
	{
		int temp, start=0, end=(size-1);
		while(start<end)
		{
			temp=arr[start];
			arr[start]=arr[end];
			arr[end]=temp;
			start++;
			end--;
		}
	printarr(arr, size);
	}
	static void printarr(int[] arr,int size)
	{
		for(int i=0;i<(size-1);i++)	
			System.out.println(" "+arr[i]);
	}

	public static void main(String args[])
	{
		int arr[]={5,4,3,2,1,0};
		reversearr(arr, 6);
	}
} 