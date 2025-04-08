import java.util.Scanner;
class Prime_of_each_rows_at_theend
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		int a[][]=new int[4][4];
		for(int r=0;r<a.length;r++)
		{
			for(int c=0;c<a[r].length;c++)
			{
				a[r][c]=sc.nextInt();
			}	
		}
		for(int r=0;r<a.length;r++)
		{
			for(int c=0;c<a[r].length;c++)
			{
				System.out.print(a[r][c]+" ");
			}
			System.out.print("Primes are ");
			for(int c=0;c<a[r].length;c++)
			{
				int count=0;
				for(int i=1;i<=a[r][c];i++)
				{
					if(a[r][c]%i==0)
					{
						count++;	
					}
				}
				if(count==2)
				{
					System.out.print(a[r][c]+" ");
				}
			}
			System.out.println();
		}
	}
}

