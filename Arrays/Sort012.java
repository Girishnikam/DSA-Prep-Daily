class Sort012
{
	static void sortArr(int arr[], int size)
	{
		int low=0,mid=0,high=size-1,temp;
		for(int i=0; i<=high;i++)
		{
			if(arr[mid]==0)
			{
				temp=arr[low];
				arr[low]=arr[mid];
				arr[mid]=temp;
				low++;
				mid++;	
			}
			else if(arr[mid]==2)
			{
				temp=arr[high];
				arr[high]=arr[mid];
				arr[mid]=temp;
				high--;
			}
			else
			{
				mid++;
			}
		}
		
	}
	public static void main(String args[])
	{
		int arr[]={0,1,0,2,0,1,0};
		sortArr(arr,7);
		for(int i=0;i<7;i++)
		{
			System.out.println(" "+arr[i]);
		}
		
	}

}