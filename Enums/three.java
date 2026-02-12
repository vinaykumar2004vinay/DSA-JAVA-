enum status
{
    Sucess,pending,failed,running;
}

class three
{
    public static void main(String[] args)
    {
        status[] s = status.values();

        for(status ss : s)
        {
            System.out.println(ss + " : " + ss.ordinal());
        }
    }
}