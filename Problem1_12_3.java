class Problem1_12_3{
    public static void main(String[] args) {
        int sum=0,product=1;
        for(int start=1;start<=10;start++)
            {
                for(int i=1;i<=start;i++)
                {
                    if(start%i==0)
                    {
                        if(i%2==0)
                        {
                            sum+=i;
                            System.out.println("sum "+sum);
                        }
                        else
                        {
                            product*=i;
                            System.out.println("product "+product);
                        }
                    }
                }
            }
            System.out.println("sum is "+sum);
                System.out.println("product is "+product);
    }
}