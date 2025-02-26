class Library
{
	public static void main(String args[])
	
	{

	 double book_price=190.00;
         int fine=10;
	 int days_keep=10;
         int charges=0;
         if(days_keep<=15)
	   {
	     //System.out.println("fine is : "+fine);
             System.out.println("No need to pay fine");
	   }
	 else if(days_keep<=30)
           {
             int days_fine=days_keep-15;
             charges=days_fine*fine;
             System.out.println("Your fine is : "+charges);
           }
         else if(days_keep>30)
           {
             System.out.println("You need to pay "+book_price+" Rupees");
           }
         else
           {
            System.out.println("You can read without fine...Keep smiling");
           }

         }
}