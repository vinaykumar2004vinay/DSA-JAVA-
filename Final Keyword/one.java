class one
{
    public static void main(String[] args)
    {
        final int num = 10;
        num = 5;
        System.out.println(num);  //error: cannot assign a value to final variable num
    }
}