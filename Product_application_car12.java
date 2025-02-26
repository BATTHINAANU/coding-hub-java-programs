class Product_application_car12
{
public static void main(String args[])
{
String product_name="Oaks Dragon";
System.out.println("My car name is: "+product_name);
double price1=20000000;
System.out.println("My car actual price is: "+price1);
String store_name="Anu electronics";
System.out.println("The store name is: "+store_name);
String Store_location="Pragathi nagar,KPHB,Hyderabad";
int pincode=521149;
System.out.println("Pincode is: "+pincode);
float discount=30f;
float discount_in_rupees=(float)((discount/100)*price1);
System.out.println("Discount in rupees is: "+discount_in_rupees);
price1=price1-discount_in_rupees;
System.out.println("price after discount is: "+price1);
String coupon_code="Anu@1234";
System.out.println("coupon code is: "+coupon_code);
boolean coupon_is_valid=true;
System.out.println("coupon code is valid or not "+coupon_is_valid);
double coupon_discount=10000;
price1=price1-coupon_discount;
System.out.println("price after coupon discount is: "+price1);
int tax=8000;
price1=price1+tax;
System.out.println("price after tax: "+price1);
byte quantity=1;
System.out.println("Quantity is :"+quantity);
char category='A';
System.out.println("Category is: "+category);
String car_no="AP1111";
System.out.println("Car number i want is : "+car_no);
double commision=10000;
price1=price1+commision;
System.out.println("price after commission : "+price1);
short year_of_buy=2025;
short month_buy=05;
short day_bu=06;
String date_of_buy="2025-05-06";
System.out.println("Date of buy is : "+date_of_buy);
boolean warranty=true;
int warranty_price=2000;
price1=price1+warranty_price;
System.out.println("price after warranty is: "+(long)(price1));
boolean insurance=true;
int insurance_money=10000;
price1=price1+insurance_money;
System.out.println("price after insurance is : "+(long)(price1));
//payment methods
String payment_method="CREDIT CARD";
if(payment_method=="CREDIT CARD")
{
discount_in_rupees=10000;
int interest_per_month=5000;
int interest_per_year=interest_per_month*12;
price1=price1-discount_in_rupees+interest_per_year;
System.out.println("Price after using credit card: "+price1);
}
else if(payment_method=="ATM CARD")
{
boolean disc=false;
System.out.println("After using ATM CARD :"+price1);
}
else if(payment_method=="phonepe")
{
discount_in_rupees=5500;
price1=price1-discount_in_rupees;
System.out.println("Price after using phonepe: "+price1);
}
else
{
System.out.println("Price is :"+price1);
}
long price2=(long)price1;
System.out.println("The final price is: "+price2);
}
}
