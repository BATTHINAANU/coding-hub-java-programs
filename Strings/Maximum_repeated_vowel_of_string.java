class Maximum_repeated_vowel_of_string
{
	public static void main(String args[])
	{
		String s="bbccdaaeeiiiiiiieeeee";
		int a_count=0,e_count=0,i_count=0,o_count=0,u_count=0;
		int max_count=Integer.MIN_VALUE;
		String max_vowel="";
		for(int x=0;x<s.length();x++)
		{
			char letter=s.charAt(x);
			if(letter=='A'||letter=='a')
				a_count++;
			else if(letter=='E'||letter=='e')
				e_count++;
			else if(letter=='I'||letter=='i')
				i_count++;
			else if(letter=='O'||letter=='o')
				o_count++;
			else if(letter=='U'||letter=='u')
				u_count++;
		}
		if(a_count>max_count)
		{
			max_count=a_count;
			max_vowel=" a";
		}
		else if(a_count==max_count)
		{
			max_vowel+=" a";
		}

		if(e_count>max_count)
		{
			max_count=e_count;
			max_vowel=" e";
		}
		else if(e_count==max_count)
		{
			max_vowel+=" e";
		}

		if(i_count>max_count)
		{
			max_count=i_count;
			max_vowel=" i";
		}
		else if(i_count==max_count)
		{
			max_vowel+=" i";
		}

		if(o_count>max_count)
		{
			max_count=o_count;
			max_vowel=" o";
		}
		else if(o_count==max_count)
		{
			max_vowel+=" o";
		}

		if(u_count>max_count)
		{
			max_count=u_count;
			max_vowel=" u";
		}
		else if(u_count==max_count)
		{
			max_vowel+=" u";
		}

		if(max_count>0)
		{
			System.out.println("The maximum repeated vowels is "+max_vowel+" with the count "+max_count);
		}
		else
		{
			System.out.println("No repeated vowel");
		}
	}
}