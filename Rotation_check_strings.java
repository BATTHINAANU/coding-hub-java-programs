import java.util.Arrays;
class Rotation_check_strings
{
	public static void main(String args[])
	{
		String s1="ABCD";
		String s2="ACDB";
		char str1[]=s1.toCharArray();
		char str2[]=s2.toCharArray();
		if(str1.length==str2.length)
		{
			int iter=str1.length;
			while(iter!=0)
			{
				char temp=str1[0];
				for(int x=0;x<str1.length-1;x++)
				{
					str1[x]=str1[x+1];
				}
				str1[str1.length-1]=temp;
				if(Arrays.equals(str1,str2))
				{
					System.out.println("EQUAL");
					break;
				}
				iter--;
			}
			if(!Arrays.equals(str1,str2))
			{
				System.out.println("NOT EQUALS");
			}
		}
	}
}