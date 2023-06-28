
public class _r37 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		function(22);
		// time complexity O(n)
	}
	
	public static void function(int n)
	{
		//constant time 
		if(n<=1)
		{
			return;
		}
		//thise loop executes with recursive loop of n/3 value
		
		for(int i=1;i<=3;i++)
		{
			System.out.println(i);
			function(n/3);
		}
	}

}
