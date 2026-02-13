class VinayException extends Exception
{
    public VinayException(String s) 
    {

    }
}

class four
{
    public static void main(String args[])
    {
        int i = 20;
        int j = 0;

        try
        {
            j = 18/i;
            if(j == 0)
            {
                throw new VinayException("Hii");
            }
        }

        catch(VinayException e)
        {
            j = 18/2;
            System.out.println("catch block " + " - " + e);
        }

        catch(Exception e)
        {
            System.out.println("Something Went Wrong..." + e);
        }

        System.out.println(j);
        System.out.println("Byee");
    }
}