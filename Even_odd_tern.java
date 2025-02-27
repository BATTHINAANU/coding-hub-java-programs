class Even_odd_tern
{
	public static void main(String args[])
		{
			int n=20; 
			double r=Math.sqrt(n);     //used to check for the perfect square or not
			int r1=n%10;               //used to know the last digit of a number
			
			System.out.println(n%2==0? 
                                           r==(int)r?
                                           "Even and perfect square":
                                           "even and not a perfect square":                
                                           r1%5==0?
                                           "Odd and divisible by 5":
                                           "odd and not divisible by 5");
		}
}