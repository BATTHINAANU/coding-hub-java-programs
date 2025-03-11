class While8
{
	public static void main(String args[])
	{
		int start=1,end=10;
		while(start<=end)
		{//1<=10 t 2<=10 t 3<=10 t.....9<=10 t 10<=10 t
			if(start%2==0) //1%2==0 f 2%2==0 t 3%2==0 f 9%2==0 f 10%2==0 t 11<=10 f
			System.out.println(start);//2.....10
			start++;//2 3 4 ......10 11
		}
		start=1;
		while(start<=end)
		{//1<=10 t 2<=10 t 3<=10 t ........11<=10 f
			if(start%2!=0)//1%2!=0 t 2%2!=0 f 3%2!=o t
			System.out.println(start); //1 3....9
			start++; //2 3 .........11
		}

	}
}