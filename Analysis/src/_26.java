
public class _26 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
          function(13);
	}
	
	public static void function(int n)
	{
		int i,j,k,count=0;
		//outer loop execute n/2 times
		for(i=n/2;i<=n;i++)
		{
			// middle loop executes log n times
			
	         for(j=1;j<=n;j=2*j)
	         {
	        	 //Inner loop execute log n times
	        	 for(k=1;k<=n;k=k*2)
	        	 {
	        		 count++;
	        	 }
	         }
			
		}
		System.out.println(count);
		
		
	}

}
