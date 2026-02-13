class one
{
    public static void main(String args[])
    {
        int i = 0;
        int j = 0;

        try
        {
            j = 18/i;
        }

        catch(ArithmeticException e)
        {
            j = 18/2;
        }

        catch(Exception e)
        {
            System.out.println("Something Went Wrong..." + e);
        }

        System.out.println(j);
        System.out.println("Byee");
    }
}