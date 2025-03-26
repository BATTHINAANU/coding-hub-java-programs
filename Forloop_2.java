class Forloop_2
{
	public static void main(String args[])
	{	int start=1;
		while(start<=10)
		{	
			if(start==5)
			{
			//break;
			continue;
			}
		System.out.println(start);
		start++;
		}
	}
}



//After continue the statements can skip
/*
C:\Users\batth\OneDrive\Desktop\coding hub java programs-practice>java Forloop_2
1
2
3
4
^C
C:\Users\batth\OneDrive\Desktop\coding hub java programs-practice>
*/