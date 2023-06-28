
public class _25 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
          function(10);
	}
	
	public static void function(int n)
	{
		int i,j,k,count=0;
		//outer loop  execute n/2 times 
		for(i=n/2;i<=n;i++)
		{
			//middle loop executed n/2 times
			for(j=1;j +n/2<=n;j++)
			{
				//inner loop execute log n times 
				for(k=1;k<=n;k=k*2)
					count++;
				
				System.out.println(k);
			}
			System.out.println(j);
		}
		System.out.println(i+" "+count);
		
	}

}
