class Days_Months_Years
{
	public static void main(String args[])
	{
		int days=1116;
		int years=0,months=0;
		if(days<31&&days>=0)
		{
		System.out.println(years+" years "+months+" months "+days+" days");
		}
		else if(days>=31&&days<372)
		{
		//days=days%31;
		months=days/31;
		days=days%31;
		System.out.println(years+" years "+months+" months "+days+" days");
                }
		else if(days>372)
		{
		//months=
		years=days/372;
		days=days%372;
		if(days<31&&days>=0)
		{
		System.out.println(years+" years "+months+" months "+days+" days");
		}
		else if(days>=31&&days<372)
		{
		//days=days%31;
		months=days/31;
		days=days%31;
		System.out.println(years+" years "+months+" months "+days+" days");
                }
		}
		else
		{
		System.out.println("Invalid");
		}
	}
}
		
				