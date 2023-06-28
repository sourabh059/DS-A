
public class _24 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		function(36);
		
		//i^2 >n =T(n)=O(n^1/2)

	}
	public static void function(int n)
	{
		int i,count=0;
		for(i=1;i*i<=n;i++)
		{
			count++;
		}
		System.out.println(count);
		
	}
}
