@FunctionalInterface
interface A
{
    void show(int i);
}

public class five
{
    public static void main(String[] args)
    {
        A obj = new A()
        {
            public void show(int i)
            {
                System.out.println("In Show" + " - " + i);
            }
        };
        obj.show(5);

    }
}