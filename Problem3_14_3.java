import java.util.Scanner;
class Problem3_14_3
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);

		System.out.println("Enter the number");
		int num=sc.nextInt();
		System.out.println("Enter the position you want");
		int position=sc.nextInt();
		int temp=num,count=0;
		while(num!=0)
		{
			count++;
			num/=10;
		}
		count=count-position;
		int power=(int)Math.pow(10,count);
		num=temp;
		if(count==0)
		{
			System.out.println("The digit in the position "+position+" is "+(num%10));
		}
		else if(count<0)
		{
			System.out.println("Invalid position");
		}
		else
		{
			int quo=num/power;
			int rem=quo%10;
			System.out.println("The digit in the position "+position+" is "+rem);
		}
		
	}
}