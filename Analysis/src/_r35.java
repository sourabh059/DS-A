
public class _r35 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		function(15);
		
		//the inner loop executes n/i times
		//time complexity is O(n log n)
		
	}
	
	public static void function(int n)
	{
		//this loop executes n times
		for(int i=1;i<=n;i++)
		{
			//thise loop executes j times with j increase by the rate of i
			for(int j=1;j<=n;j+=i)
			{
				System.out.println("*");
			}
		}
	}

}
