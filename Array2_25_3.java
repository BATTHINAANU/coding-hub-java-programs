import java.util.Scanner;
class Array2_25_3
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		//System.out.println("Enter the size:");
		//int size=sc.nextInt();
		//int arr[]=new int[size];
		int arr[]=new int[5];
		arr[0]=12;
		arr[1]=13;
		arr[2]='a';
		arr[4]=28;
		System.out.println(arr[0]);
		System.out.println(arr[1]);
		System.out.println(arr[2]);
		System.out.println(arr[3]);//Default value of int will be the output
		System.out.println(arr[arr.length-1]);
		System.out.println(arr[-1]);//java.lang.ArrayIndexOutOfBoundsException
		/*for(int i=0;i<arr.length;i++)
		{
			arr[i]=sc.nextInt();
			//System.out.println(arr[i]);
		}
		for(int i=0;i<arr.length;i++)
		{
			System.out.println(arr[i]);
		}*/
	}
}
class Anu
{

}