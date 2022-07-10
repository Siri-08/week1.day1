package week1day1;

public class IsPrime {

	public static void main(String[] args) 
	
	{
		// TODO Auto-generated method stub
		
		int n = 39;
		boolean isprime = true;
		
		if(n==1)
		{
			System.out.println(n +" Is not a Prime");
	
		}
		else 
		{
			for (int i=2;i<n/2;i++)
			{
				if(n%i ==0)
				{
					isprime = false;
					break;
				}
							
			}
			
			if ( isprime == false)
			{
				System.out.println(n +" Is not a Prime number");
			}
			else
				System.out.println(n +" Is a Prime number");
	    }
         
	}

}
