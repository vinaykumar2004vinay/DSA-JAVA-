enum status
{
    Sucess,pending,failed,running;
}

class two
{
    public static void main(String[] args)
    {
        status s = status.running;
        System.out.println(s.ordinal());
    }
}