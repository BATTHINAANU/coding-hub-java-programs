import java.util.Scanner;
class Almas 
{
    public static void main(String[] args) 
	{
        	Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int arr[]=new int[n];
		if(1 <= n && n <= 105)
		 {
			for(int i=0;i<n;i++)
		    	{
		        	arr[i]=sc.nextInt(); 
		    	}
			for(int i=0;i<n;i++)
			{
				if(arr[i]%2!=0)
				{
					System.out.print(arr[i]+" ");
				}
			}
			for(int i=0;i<n;i++)
			{
				if(arr[i]%2==0)
				{
					System.out.print(arr[i]+" ");
				}
			}
		}
		sc.close();
	}
}