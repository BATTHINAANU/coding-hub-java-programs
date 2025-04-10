public class Split_demo
{
	public static void main(String[] args) 
	{
        	String input = "ale";
        	String[] fruits = input.split("a");
        
        	for (String fruit : fruits) 
		{
            		System.out.println(fruit);
       		}
        }
}