class Min_Digit
{
    public static void main(String args[])
    {
        int num=101,min=9,rem=0;
        while(num!=0)
        {
            rem=num%10;
            if(rem<min)
                min=rem;
            num/=10;
        }
        System.out.println("Minimum digit is "+min);
    }
}