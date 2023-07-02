//Used nested class to return 2 values at once
//static class is allowed only with nested class

class MaxnMin
{
	static class Pair
	{
		int min, max;
	}
	static Pair minmax(int arr[], int size)
	{	
		Pair m=new Pair();
		if(size==1)
		{
			m.min=arr[0];
			m.max=arr[0];
			return m;
		}
		if(arr[0]>arr[1])
		{
			m.max=arr[0];
			m.min=arr[1];	
		}
		else
		{
			m.max=arr[1];
			m.min=arr[0];
		}
		for(int i=2; i<size;i++)
		{
			if(arr[i]>m.max)
				m.max=arr[i];
			if(arr[i]<m.min)
				m.min=arr[i];
		}
		return m;
	}
	public static void main(String args[])
	{
		int arr[]={0,0,7,3,8,0,3};
		Pair m=minmax(arr,7);
		System.out.println("Smallest: "+m.min);
		System.out.println("Greatest: "+m.max);
		
	}
}