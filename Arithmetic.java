class Arithmetic
{
	public static void main(String args[])
	{
		int num1=23,num2=25;
		char symbol='-';
		switch(symbol)
			{
			case '+':
			
			int addition=num1+num2;
			System.out.println("Sum is : "+addition);
			break;
			
			case '-':
			
			int subtraction=num1-num2;
			System.out.println("After subtracting the result is : "+subtraction);
			break;
			
			case '*':
			
			int mul=num1*num2;
			System.out.println("Multiplication is : "+mul);
			break;
			
			case '/':
			
				if(num1>num2)
				{
				System.out.println("After division : "+num1/num2);
				}
				else
				{
				System.out.println("After division : "+num2/num1);
				}
			break;
			
			case '%':
			
			        if(num1>num2)
				{
				System.out.println("After modulus : "+num1%num2);
				}
				else
				{
				System.out.println("After modulus : "+num2%num1);
				}
			break;
			
			default:
			
			System.out.println("Invalid character....");
			
			
		}
	}
}