package week1day1;

public class Fibonacci {

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		
		int first = 0;
		int second = 1;
		int sum =0;
		int length = 11;
		
		System.out.println(first);
		System.out.println(second);
		
		for ( int i=2;i<length;i++)
		{
			sum = first + second;
			System.out.println(sum);
			first = second;
			second = sum;
		}
		
		/*
		 * while(sum<55) { sum = first + second; System.out.println(sum); first =
		 * second; second = sum; }
		 */

	}

}
