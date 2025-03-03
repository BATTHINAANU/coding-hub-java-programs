class Product_application_necklace 
{
	public static void main(String args[])
	{
		String pname="NECKLACE";
			System.out.println("Product name is : "+pname);
		String pcode="NE";
			System.out.println("Product code is : "+pcode);
		int pprice=6000;
			System.out.println("Product price is : "+pprice);
		byte pquantity=3;
			System.out.println("Product quantity is : "+pquantity);
		double discount=0,discount_inr=0;
		double ptotal=pprice*pquantity;
			System.out.println("Total price of product is : "+ptotal);
		if(ptotal>=1000&&ptotal<=2000)
			{
			  discount=10;
			  discount_inr=ptotal*discount/100;
			  System.out.println("Discount in rupees : "+discount_inr);
			  ptotal=ptotal-discount_inr;
			  System.out.println("Price after discount is : "+ptotal); 	   
			}
		else if(ptotal>2000&&ptotal<=3000)
			{
			  discount=15;
			  discount_inr=ptotal*discount/100;
			  System.out.println("Discount in rupees : "+discount_inr);
                          ptotal=ptotal-discount_inr;
			  System.out.println("Price after discount is : "+ptotal);  
			}
		else if(ptotal>3000 && ptotal<=4000)
			{
			  discount=20;
			  discount_inr=ptotal*discount/100;
                          System.out.println("Discount in rupees : "+discount_inr);
                          ptotal=ptotal-discount_inr;
			  System.out.println("Price after discount is : "+ptotal);
			}
		else
			{
			  discount=30;
			  discount_inr=ptotal*discount/100;
				System.out.println("Discount in rupees : "+discount_inr);
				if(discount_inr<=1400)
				{
				ptotal=ptotal-discount_inr;
			        System.out.println("Price after discount is : "+ptotal);
			
				}
				else 
				{
				   discount_inr=1400;
				   ptotal=ptotal-discount_inr;
				   System.out.println("Price after discount is : "+ptotal);
				}
			}
		double final_total=ptotal;
		double tax=18;
	        double tax_inr=final_total*tax/100;
		    System.out.println("Tax in rupees : "+tax_inr);
		double bill=final_total-tax_inr;
		    System.out.println("the final bill is : "+bill);	
		
	}
}