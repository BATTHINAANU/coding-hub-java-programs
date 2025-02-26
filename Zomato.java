class Zomato
{
public static void main(String args[])
{
String customer_name="Anu Batthina";
System.out.println("Customer name : "+customer_name);

String phone_no="9949147427";
System.out.println("contact info is : "+phone_no);

char gender='F';
System.out.println("Gender is : "+gender);

String email="batthinaanu068@gmail.com";
System.out.println("Email address is : "+email);

String ordered_date="24-02-2025";
System.out.println("Ordered date : "+ordered_date);

String service="Food Service";
System.out.println("service : "+service);

String service_name="Zomato";
System.out.println("service name : "+service_name);

String my_order=" Mushroom Pizza ";
System.out.println("Item i ordered : "+my_order);

boolean food_availability=true;
String location="Pragathi nagar,kphb colony,Hyderabad,Road no";
System.out.println("Location is : "+location);

double price=500;
int quantity=2;
System.out.println("Quantity is : "+quantity);

price=price*quantity;
System.out.println("Price is : "+price);

double delivery_time=20;
System.out.println("Delivery within "+delivery_time+" minutes");

double discount=20;
price=price-discount;
System.out.println("Price after discount : "+price);

byte gst=50;
price=price+gst;
System.out.println("Price after gst : "+price);

short delivery_charges=60;
price=price+delivery_charges;
System.out.println("Price after delivery charges : "+price);

String payment_method="Phonepe";
if(payment_method=="Phonepe"||payment_method=="gpay"||payment_method=="paytm")
{
discount=50;
price=price-discount;
System.out.println("price when payment method is phonepe is : "+price);
}
else
{
System.out.println("price when cashon delivery"+price);
}


String food_taste="Super";
byte rating=0;
if(food_taste=="Super")
{
rating=5;
System.out.println("Rating is : "+rating);
}
else if(food_taste=="Above average")
{
rating=4;
System.out.println("Rating is : "+rating);
}
else if(food_taste=="Average")
{
rating=3;
System.out.println("Rating is : "+rating);
}
else if(food_taste=="Below average")
{
rating=2;
System.out.println("Rating is : "+rating);
}
else
{
rating=1;
System.out.println("Rating is : "+rating);
}
int rate_for_service=5;
System.out.println("Rate for the service is : "+rate_for_service);
}
}




