class Zomato
{
public static void main(String args[])
{
String service_name="              ZOMATO            ";
System.out.println(service_name);
System.out.println("             --------                       ");

System.out.println("                                       ");


String available_food="Veg & NonVeg Multi Cuisine";
System.out.println(available_food);

String shop_no="2 & 3.";
System.out.println("Shop No."+shop_no);

String location="Pragathi nagar,Secunderabad,Hyderabad,Road no";
long pincode=521149l;
System.out.println(location+" "+pincode);

String phone_no="9949147427";
String alternative_no="9505997477";
System.out.println("Ph: "+phone_no+","+alternative_no);

System.out.println("                                       ");
System.out.println("--------------CASH MEMO---------------");
System.out.println("                                       ");


String ordered_date="24/02/2025";
String bill_no="D/46";
System.out.println("Date: "+ordered_date+"     "+"Bill No.  :"+bill_no);

System.out.println("");

String delivery_boy_name="GANESH";
System.out.println("Boy : "+delivery_boy_name);

System.out.println("");
System.out.println("--------------------------------------");

System.out.println("Particulars        Qty   Rate   Amount");

System.out.println("--------------------------------------");

boolean food_availability=true;
String my_order="MUSHROOM PIZZA";
int qty=2;
int rate=500;
int amount=qty*rate;
int price=amount;
int discount=80;
price=price-discount;
short delivery_charges=60;
price=price+delivery_charges;
String payment_method="Phonepe";
if(payment_method=="Phonepe")
{
discount=50;
price=price-discount;
}
else if(payment_method=="gpay")
{
discount=50;
price=price-discount;
}
else if(payment_method=="paytm")
{
discount=20;
price=price-discount;
}
else if(payment_method=="Credit Card")
{
discount=40;
price=price-discount;
}
else if(payment_method=="Debit Card")
{
discount=50;
price=price-discount;
}
int gst=20;
price=price+gst;

System.out.println(my_order+"      "+qty+"    "+rate+"    "+amount);

System.out.println("--------------------------------------");

int count_items_ordered=1;
System.out.println(count_items_ordered+"/"+qty+"     "+"          Total :        "+price);

System.out.println("--------------------------------------");

String gst_no="27ABAFM877";
System.out.println("GST NO : "+gst_no);

System.out.println("--------------------------------------");


System.out.println("     Thank You    "+"Visit Again");

System.out.println("                                      ");
System.out.println("                                      ");
System.out.println("                                      ");







String customer_name="Anu Batthina";
System.out.println("Customer name : "+customer_name);

char gender='F';
System.out.println("Gender is : "+gender);

String email="batthinaanu068@gmail.com";
System.out.println("Email address is : "+email);

double delivery_time=20;
System.out.println("Delivery within "+delivery_time+" minutes");


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




