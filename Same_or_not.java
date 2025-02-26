class Same_or_not
{
public static void main(String args[])
{
char capital='a';
char small='A';
int n1=(int)(capital);
int n2=(int)(small);
if(n1>n2||n2>n1)
{
if(n1==(n2-32))
{
System.out.println("Both are same");
}
else if(n2==(n1+32))
{
System.out.println("Both are same");
}
else
{
break;
}
}
else if(n1==n2)
{
System.out.println("Both are same");
}
else
{
System.out.println("Both are not same");
}
}
}