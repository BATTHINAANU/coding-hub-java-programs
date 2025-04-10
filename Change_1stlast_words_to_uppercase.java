import java.util.Arrays;
class Change_1stlast_words_to_uppercase
{//input:"hello all good morning"    output:"HELLO all good MORNING"
	public static void main(String args[])
	{
		String s1="    Hello all Good morning     ",res="";
		s1=s1.trim();//removes 1st and laSt spaces
		System.out.println(s1);
		for(int x=0;x<s1.length();x++)
		{
			char letter=s1.charAt(x);
			if((x+1)!=s1.length() && s1.charAt(x)==' ' && s1.charAt(x+1)==' ')
				continue;
			else
				res=res+letter;
		}
		System.out.println("After removing extra spaces "+res);
		String str[]=res.split(" ");
		for(String t:str)
			System.out.println(t);
		str[0]=str[0].toUpperCase();
		str[str.length-1]=str[str.length-1].toUpperCase();		
		s1=Arrays.toString(str);
			System.out.println(s1);
	}
}