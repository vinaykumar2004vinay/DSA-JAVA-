enum status
{
    sucess,pending,failed,running;
}

class five
{
    public static void main(String[] args)
    {
        status s = status.running;

        switch(s)
        {
            case sucess:
                System.out.println("Sucessful"); 
                break;
            case pending:
                System.out.println("Pending");
                break;
            case failed:
                System.out.println("Failed");
                break;
            case running:
                System.out.println("Running");
        }
    }
}