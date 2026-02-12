enum status
{
    sucess,pending,failed,running;
}

class four
{
    public static void main(String[] args)
    {
        status s = status.running;

        if(s == status.sucess)
        {
            System.out.println("Successful");
        }
        else if(s == status.pending)
        {
            System.out.println("Pending");
        }
        else if(s == status.failed)
        {
            System.out.println("failed");
        }
        else
        {
            System.out.println("Running");
        }
    }
}