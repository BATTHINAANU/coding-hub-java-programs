class Days_in_a_month
{
	public static void main(String args[])
	{
	 int i=1;
	 if(i==1||i==3||i==5||i==7||i==8||i==10||i==12)
	 System.out.println(i+" has 31 days");
	 else if(i==2)
	 System.out.println("28 or 29 days");
	 else if(i==4||i==6||i==9||i==11)
	 System.out.println(i+" has 3o days");
	 else
	 System.out.println(i+" is invalid input");
	}
}