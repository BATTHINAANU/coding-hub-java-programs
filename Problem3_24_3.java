class Problem3_24_3
{
	public static void main(String args[])
	{
		Automatic_number a=new Automatic_number();
		a.num=78;
		int square=a.squareNum();
		a.checkAutomatic(square);
		
	}
}
class Automatic_number
{
	int num;
	int squareNum()
	{
		int square=num*num;
		return square;
	}
        void checkAutomatic(int square)
	{
		int rem=square%100;
		System.out.println("Rem"+rem);
		if(rem==num)
			System.out.println("AUTOMATIC NUMBER");
			
	}
	
}