import java.util.Scanner;
import java.util.Random;
class Array_25_3
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the size:");
		int size=sc.nextInt();
		int arr[]=new int[size];
		System.out.println(arr);//output:- [I@6d03e736
		System.out.println(arr.toString());////output:- [I@6d03e736
		Anu a=new Anu();
		System.out.println(a);//output:-Anu@378bf509
		System.out.println(a.toString());//output:-Anu@378bf509
		System.out.println(sc.getClass());//output:-class java.util.Scanner
		System.out.println(a.getClass());//output:-class Anu
		Random r=new Random();
		System.out.println(r.getClass());//output:-class java.util.Random
		System.out.println(r);//output:- java.util.Random@2d98a335
	}
}
class Anu
{

}