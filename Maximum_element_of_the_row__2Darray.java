import java.util.Scanner;
class Maximum_element_of_the_row__2Darray
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		int a[][]=new int[3][4];
		for(int r=0;r<a.length;r++)
		{
			for(int c=0;c<a[r].length;c++)
			{
				a[r][c]=sc.nextInt();
			}	
		}
		for(int r=0;r<a.length;r++)
		{
			int max=Integer.MIN_VALUE;
			for(int c=0;c<a[r].length;c++)
			{
				System.out.print(a[r][c]+" ");
			}
			for(int c=0;c<a[r].length;c++)
			{
				if(a[r][c]>max)
				{
					max=a[r][c];
				}
			}
			System.out.print("Maximum value in the row is "+max);
			System.out.println();
		}
	}
}