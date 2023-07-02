import java.util.*;
class ArraylistTry
{
	public static void main(String args[])
	{
		List<Integer> arr=new ArrayList<Integer>();
		arr.add(10);
		arr.add(0, 5);
		System.out.println(" "+arr.get(0));
		System.out.println(" "+arr.get(1));
		List<Integer> ar=new ArrayList<Integer>();
		ar.add(1);
		ar.add(2);
		ar.add(3);
		ar.add(4);
		arr.addAll(ar);
		for(int i:arr)
			System.out.print(" "+i);
		System.out.println("Contains: "+arr.contains(92));
	}
}