class Nested
{
	public static void main(String args[])
		{
			int age=120;
                        char gender='M';
			String education="PHD";
			 
			System.out.println(age<100?age>=60?gender=='F'?"female senior citizen and 30000 retirement amount":"male senior citizen and 35000 retirement amount":
			age>=18?education=="UG"?"You are a UG student and your scholarship is 30000":education=="PG"?"You are a PG student and your scholarship is 40000":"your scholarship is 20000":
"you are a minor and you are not eligible to take scholarships or retirement amounts":"Invalid input");
			
		}
}
