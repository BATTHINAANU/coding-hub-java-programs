import java.util.Scanner;
class Problem1_15_3
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number value : ");
		int num=sc.nextInt();
		System.out.println("Enter the value that you are searching for ");
		int value=sc.nextInt();
		int count=0,temp=num;
		while(num!=0)
		{
			count++;
			num/=10;
		}
		num=temp;
		int count1=0,rem=0,temp_count=count;
		while(num!=0)
		{
			rem=num%10;
			if(rem==value)
			{
				while(temp!=0)
				{
					int rem1=temp%10;
					if(rem1==value)
					{
						count1++;
						System.out.println(value+" at a position "+count);
					}
					count--;
					temp/=10;
				}		
			     break;		
			}
			num/=10;
		}
		System.out.println(value+" exists in the number");
		System.out.println("The digit occurs in "+count1+" times in a number");	
	}
}