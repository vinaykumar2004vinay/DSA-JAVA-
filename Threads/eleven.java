public class eleven
{
    public static void main(String[] args)
    {
        Runnable obj1 = () ->
            {
                for(int i=1;i<=10;i++)
                {
                    System.out.println("Hii");
                    try
                    {
                        Thread.sleep(10);
                    } 
                    catch (InterruptedException e)
                    {
                        e.printStackTrace();
                    }
                }
            };
        Runnable obj2 = () ->
            {
                for(int i=1;i<=10;i++)
                {
                    System.out.println("Hello");
                    try
                    {
                        Thread.sleep(10);
                    } 
                    catch (InterruptedException e)
                    {
                        e.printStackTrace();
                    }
                }
            };

        Thread T1 = new Thread(obj1);
        Thread T2 = new Thread(obj2);

        T1.start();
        T2.start();
    }
}