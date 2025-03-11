/*
class Practice10_6_3
{
	public static void main(String args[])
	{
		int n1=6,n2=13,max1=0,max2=0,max=0;       //Highest common factor
		int n=n1<n2?n1:n2;//6
		int start=1,end=n/2;//end=6/2=3
		while(start<=end)
		{//1<=3t 2<=3t 3<=3t 4<=3f
			if(n1%start==0)
			{//6%1==0t 6%2==0t 6%3==0t
				System.out.println(n1+" divisor "+start);//1 2 3
				max1=start;//1 2 3
			}
			if(n2%start==0)
			{//12%1==0t 12%2==0t 12%3==0t
				System.out.println(n2+" divisor "+start);//1 2 3
				max2=start;//1 2 3
			}
			if(max1==max2)//1==1 2==2 3==3
			 max=max1;//1 2 3
			start++;//2 3 4
		}
			System.out.println("Highest common factor is : "+max);//3
	}
}

*/
/*
class Practice10_6_3
{
	public static void main(String args[])
	{
		int n1=6,n2=12,max1=0,max2=0,max=0;     //Lowest common factor
		int n=n1<n2?n1:n2;
		int start=1,end=n/2;
		while(end>=start)
		{
			if(n1%end==0)
			{
				System.out.println(n1+" divisor "+end);
				max1=end;
			}
			if(n2%end==0)
			{
				System.out.println(n2+" divisor "+end);
				max2=end;
			}
			if(max1==max2)
			 max=max1;
			end--;
		}
			System.out.println("Lowest common factor is : "+max);
	}
}
*/

class Practice10_6_3
{
	public static void main(String args[])
	{
		int n1=12,n2=6,max1=0,max2=0,max=0;     //Lowest common factor except 1
		int n=n1<n2?n1:n2;
		int start=1,end=n/2;
		while(end>start)
		{
			if(n1%end==0)
			{
				System.out.println(n1+" divisor "+end);
				max1=end;
			}
			if(n2%end==0)
			{
				System.out.println(n2+" divisor "+end);
				max2=end;
			}
			if(max1==max2)
			 max=max1;
			end--;
		}
			System.out.println("Lowest common factor is : "+max);
	}
}

