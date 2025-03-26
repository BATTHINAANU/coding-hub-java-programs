import java.util.Scanner;
class Problem2_14_3
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);

		System.out.println("Enter the number");
		int num=sc.nextInt();
		int position=1,temp=num,count=0;
		while(num!=0)
		{
			count++;
			num/=10;
		}
		num=temp;
		int power=(int)Math.pow(10,count-1);
		if(count>1)
		{
			int quo=num/power;
			System.out.println("in "+temp+" the digit in position "+position+" is "+quo);
		}
		else
			System.out.println("in "+temp+" the digit in position "+position+" is "+num);	
		
	}
}