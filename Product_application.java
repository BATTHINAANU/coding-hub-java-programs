/*class Product_application
{
public static void main(String args[])
{
long num1=2147483648l;
float num2=2147483648f;
System.out.println(num2);
}
}
//Due to precision float stores long*/




class Main {
public static void main(String[] args) {
String product_name="Shoes";
int price1=9999;
int quantity=1;
int price2=price1*quantity;
System.out.println("Actual price is:"+price2);
float discount=41f;
float disc=(discount/100);
float discount_in_rupees=(disc)*price1;
double price3=price2-discount_in_rupees;
System.out.println("Price after discount is:"+price3);
char category='A';
boolean stock=true;
byte size=10;
short delivery_charges=60;
double price4=price3+delivery_charges;
System.out.println("price with delivery charges is : "+price4);
double tax=80;
double price5=price4+tax;
System.out.println("price after tax is : "+price5);
String coupon_code="Anu@1234";
boolean coupon_is_valid=true;
double coupon_discount=100;
double price6=price5-coupon_discount;
System.out.println("price after using coupons: "+price6);
long final_price=(long)(price6);
System.out.println("final price is:"+final_price); 
    }
}

