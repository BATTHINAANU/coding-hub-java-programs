class Leap_year_if
{
	public static void main(String args[])
	{
		int num=2001;
		if(num%4==0&&num%100!=0||num%400==0)
		System.out.println(num+" is a leap year...");
		else
		System.out.println(num+" is not a leap year...");
	}
}