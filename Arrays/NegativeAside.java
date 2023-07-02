class NegativeAside
{
	static void groupAll(int arr[], int size)
	{
		int low=0, mid=0, temp;
		for(int i=0;i<size;i++)
		{
			if(arr[mid]<0)
			{
				temp=arr[mid];
				arr[mid]=arr[low];
				arr[low]=temp;
				mid++;
				low++;
			}
			else
				mid++;
		}
	}
	public static void main(String args[])
	{
		int arr[]={-2,5,-3,0,2,-1};
		groupAll(arr, 6);
		for(int i: arr)
			System.out.print(" "+i);	
	}
}