//Not completed
class NoSortAlgo
{
	static void sortArray(int[] arr, int size)
	{
		int min, temp;
		for(int i=0;i<size;i++)
		{
			min=arr[i];
			for(int j=i+1; j<size; j++)
			{
				if(arr[j]<min)
				{
					temp=arr[j];
					arr[j]=min;
					min=temp;
				}
			}
		}
	}
	public static void main(String args[])
	{
			int arr[]={8,3,2,7,1};
			for(int  i=0; i<5;i++)
			{
				System.out.print(" "+arr[i]);
			}
			System.out.println("After sort");
			sortArray(arr, 5);
			for(int  i=0; i<5;i++)
			{
				System.out.print(" "+arr[i]);
			}
	}
}