class Even_Odd_Digit
{
    public static void main(String[] args) 
    {
       int num=1234,count=0,temp=num,sum=0,last_digit=0,quo=0,power=0,half_1=0,half_2=0;
       while(num!=0)
       {
           count++;
           num/=10;
       }
       num=temp;
       if(count%2==0)
       {
          count/=2;
          power=(int)Math.pow(10,count);
          half_1=num/power;
          half_2=num%power;
          sum=half_1+half_2;
          System.out.println("Sum is "+sum);
       }
       else
       {
           quo=num/10;
           last_digit=num%10;
           sum=quo+last_digit;
           System.out.println("Sum is "+sum);
       }
    }
}