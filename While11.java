/*
class  While11
{
	public static void main(String args[])
	{
		int start=1600,end=2000;
		while(start<=end) //1600<=2000t ........ 1608<=2000t    ......   2000<=2000 t 
		{
			if(start%4==0&&start%100!=0||start%400==0)//1600%4==0 && 1600%100!=0 || 1600%400==0                    1608%4==0 && 1608%100!=0 || 1608%400==0                          							   2000%4==0 && 2000%100!=0 || 2000%400==0     		  
			{					  //    t      &&     f          				   t     &&     t                    							                                        t    &&     f                               
								  //            f            ||    t       t                              t                    t                                                                                                     f              ||     t               t   
			
					if(start%6==0)       //1600%6==0 f  1608%6==0 t  2000%6==0  f 
					System.out.println(start); //1608
		        }
			start++;  //1601....1608 ....2000  2001

		}
	}
}
*/

class While11
{
	public static void main(String args[])
	{
		int start=1800,end=2000;
		String s=" ";
		while(start<=end)
		{
		  	s=start%4==0&&start%100!=0||start%400==0?start%6==0?" Leap year and divisible by 6":" leap year but not divisible by 6":" Not leap year";
		  	System.out.println(start+" is a "+s);
			start++;	
		}
			}
}