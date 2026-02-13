class one
{
    public static void main(String args[])
    {
        int i = 9;
        int j = 0;

        try
        {
            j = 18/i;
        }

        catch(Exception e)
        {
            System.out.println("Something Went Wrong");
        }

        System.out.println(j);
        System.out.println("Byee");
    }
}