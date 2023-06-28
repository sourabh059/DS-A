
public class _R28 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	 function(5);	
    
	}

	public static void function(int n)
	{
		//constant time
        if(n<1)
        {
        	return;
        }
        
        //outer loop execute n time 
         for(int i=1;i<=n;i++)
         {
        	 //inner loop executes n times
        	 for(int j=1;j<=n;j++)
        	 {
        		//constant time
        		 System.out.println(" * ");
        	 }
        	 
         }
         
         function(n-3);
		
	}
	
}
