 class While12
{
	public static void main(String args[])
	{
		int start=10,end=1,table=8;

		while(start>=end)
		{//10>=1t9>=1t 8>=10t 7>=10t 6>=10t 5>=10t 4>=10t 3>=10t 2>=10t 1>=1t 0>=1f
			int product=table*start;//pro=8*10=80 72 64 56 48 40 32 24 16 8
			double sqrt=Math.sqrt(product);//sqrt=8.944271909999159  8.48528137424  8.0 7.48331477355 6.92820323028 6.32455532034 5.65685424949 4.89897948557 4.0 2.82842712475
			if(sqrt==(int)sqrt)//8.944271909999159==8f 8.48528137424==8f 8.0==8t 7.48331477355==7f  6.92820323028==6f 6.32455532034==6f 5.65685424949==5f 4.89897948557==4f 4.0==4t 2.82842712475==2f 
			{
				System.out.println(table+"X"+start+"="+product);  //8X8=64 8X2=16
			}
			start--;//9 8 7 6 5 4 3 2 1 0
		}
	}
}