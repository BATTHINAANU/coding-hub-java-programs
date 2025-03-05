class NPR
{
	public static void main(String args[])
	{
		int n=5,r=3;
		int start1=1,end=n;//end=5
                int subtract=n-r;//subtract=5-3=2
		//int start2=1;
                int n_fact=1,n_r_fact=1;
		while(start1<=end)
		{//1<=5 t 2<=5 t 3<=5 t 4<=5 t 5<=5 t 6<=5 f
		 n_fact*=start1;//n_fact=1*1=1 1*2=2 2*3=6 6*4=24 24*5=120
		 start1++;//2 3 4 5 6
		}
		System.out.println("n! is: "+n_fact);//120
		start1=1;
		while(start1<=subtract)
		{//1<=2 t 2<=2 t 3<=2 f
		 n_r_fact*=start1;//n_r_fact=1*1=1 1*2=2
		 start1++;//2 3
		}
		System.out.println("(n-r)! is : "+n_r_fact);//2
		int total=n_fact/n_r_fact;//total=120/2=60
		System.out.println("npr value is : "+total);//60

	}
}