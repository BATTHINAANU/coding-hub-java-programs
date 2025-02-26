/*class Perfect_square
{
public static void main(String args[])
{
int num=3;
int root=(int)(Math.sqrt(num));
System.out.println(root);
if((root*root)==num)
{
System.out.println(num+" is a perfect square");
}
else
{
System.out.println(num+" is not a perfect square");
}
}
}*/

class Perfect_square
{
public static void main(String args[])
{
int num1=3;
double root=(int)(Math.sqrt(num1));
System.out.println(((root*root)==num1)?"Perfect square":"not a perfect square");
}
}