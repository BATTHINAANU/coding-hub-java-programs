class Grades
{
       public static void main(String args[])
	{

	int m1=35,m2=36,m3=37,m4=38,m5=38,m6=42;
	int total=m1+m2+m3+m4+m5+m6;
	System.out.println("Total is : "+total);    //226

	float max=600f;
	double percentage=total/max*100;        //37.66666793823242
	System.out.println("Percentage is : "+percentage);

	if(m1<35||m2<35||m3<35||m4<35||m5<35||m6<35) //35<35 F  36<35 F 37<35 f  38<35 f  38<35 f 42<35 f
	System.out.println("Failed");

	else if(percentage>100)   //37.66666793823242>100 f
	System.out.println("Invalid percentage");

	else if(percentage>=90)   //37.66666793823242 > 90 f  37.66666793823242 ==90 f
	System.out.println("A grade");

	else if(percentage>=75)   //37.66666793823242>75  f   37.66666793823242==75 f
	System.out.println("C grade");

	else if (percentage>=55)   //37.66666793823242>55 f   37.66666793823242==55 f
	System.out.println("D grade");

	else if(percentage>=35)    //37.66666793823242>35 t   
	System.out.println("E grade");   //This will print

	else
	System.out.println("Failed");

	}
}