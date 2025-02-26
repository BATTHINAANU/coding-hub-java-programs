class Problem_2
{
public static void main(String args[])
{
double time_in_hours=5.50;
int hours=(int)(time_in_hours);
int hours_to_minutes=hours*60;
double mins=(time_in_hours-hours)*60;
double time_in_minutes=(hours_to_minutes)+mins;
System.out.println((int)(time_in_minutes)+" Minutes");
}
}