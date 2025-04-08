import java.util.Arrays;
class Binary_search_onstring
{
	public static void main(String args[])
	{
		String str="Hello all good morning";
		char c[]=str.toCharArray();
		char search='g';
		System.out.println("Array before sorting");
		for(char t:c)
			System.out.println(t);
		int first=0,last=c.length-1;
		Arrays.sort(c);
		System.out.println("Array after sorting");
		for(char t:c)
			System.out.println(t);	
		while(first<=last)
		{
			int mid=(first+last)/2;
			if(c[mid]==search)
			{
				System.out.println(search+" is found at index "+mid);
				break;
			}
			else if(search>c[mid])
				first=mid+1;
			else
				last=mid-1;
		}
		if(first>last)
			System.out.println(search+" is not found");
	}
}