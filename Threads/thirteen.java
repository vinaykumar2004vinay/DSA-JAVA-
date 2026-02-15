class counter
{
    int count;
    public synchronized void increment()
    {
        count++;
    }
}

public class thirteen
{
    public static void main(String[] args) throws InterruptedException
    {
        counter obj = new counter();

        Runnable obj1 = () ->
            {
                for(int i=1;i<=1000;i++)
                {
                    obj.increment();
                }
            };
        Runnable obj2 = () ->
            {
                for(int i=1;i<=1000;i++)
                {
                    obj.increment();
                }
            };

        Thread T1 = new Thread(obj1);
        Thread T2 = new Thread(obj2);

        T1.start();
        T2.start();

        T1.join();
        T2.join();
        
        System.out.println(obj.count);
    }
}