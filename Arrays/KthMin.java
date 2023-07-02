//Not completed yet, coz needs sorting 

class KthMin
{
	static int mink(int[] arr, int size)
	{
		int min=arr[0], min2, min3;
		for(int i=1; i<size; i++)
		{
			if(arr[i]<min)
				min=arr[i];	
		}
		
	}
	public static void main(String args[])
	{
		int arr[]={5,3,5,6,2,5,1,0};
		System.out.println("Smallest: "+mink(arr, 8));
	}
}