
public class _27 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        
		function(25);
		//the time complexity of above function is O(n)
		
	}
	public static void function(int n)
	{
		if(n==1)
		{
			return ;
		}
		
		//outer loop execute n times
		for(int i=1;i<=n;i++)
		{
			//inner loop executes only time due to break statement
			for(int j=1;j<=n;j++)
			{
				System.out.println("*");
				break;
			}
		}
	}

}
