
public class RunningTime {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//running time of the following question
		
		function(10);
		
		//time complexity O(n^1/2)

	}
	
	public static void function(int n)
	{
		int i=1,s=1;
		//s is increasing not a rate as 1 but rate as i
		while(s<=n)
		{
			i++;
			s=s+i;
			System.out.println("*");
			System.out.println(s);
		}
				
	}

}
