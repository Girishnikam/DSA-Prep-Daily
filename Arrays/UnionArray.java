class UnionArray
{
	static void unionelement(int[] a, int[] b, int m, int n)
	{
		int ans=m, flag=0;
		for(int i=0; i<m; i++)
		{
			for(int j=0; j<n; j++)
			{
				if(a[i]==b[j])
					flag++;
			}
		}
		System.out.println(" "+(ans+flag));
	}
	public static void main(String args[])
	{
		int[] a={1,3,6,8,3};
		int[] b={3,5,1};
		unionelement(a,b,5,3);
		
	}
}