import java.util.*;
class IntersectionArray
{
	public static void main(String args[])
	{
	int[] arr1={3,2,5,7,1};
	int[] arr2={8,9,2,7,1};
	int low=0, high=0;
	Arrays.sort(arr1);
	Arrays.sort(arr2);	
	ArrayList<Integer> a=new ArrayList<Integer>();
	while(true)
	{
		if(arr1.length<=low || arr2.length<=high)
			break;
		if(arr1[low]==arr2[high])
		{
			a.add(arr1[low]);
			low++;
			high++;
		}
		else if(arr1[low]>arr2[high])
		{
			high++;
		}
		else if(arr1[low]<arr2[high])
			low++;
	}
	System.out.println(" "+a);
	System.out.println("Size:"+a.size());
	}
	
}