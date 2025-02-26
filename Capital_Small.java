/*class Capital_Small
{
public static void main(String args[])
{
int num=123;
char capital='A';
char small='a';
int n1=capital;
int n2=small;
if(num<100)
{
System.out.println((char)(n1+32));
}
else
{
System.out.println((char)(n2-32));
}
}
}*/



class Capital_Small
{
public static void main(String args[])
{
int num=100;
char capital='A';
char small='a';
int n1=capital;
int n2=small;
System.out.println((num<100)?(char)(n1+32):(char)(n2-32));
System.out.println((int)'A');
}
}



