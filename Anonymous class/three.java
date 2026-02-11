abstract class A
{
    public abstract void show();
}

public class three
{
    public static void main(String[] args)
    {
        A obj = new A()
        {
            public void show()
            {
                System.out.println("In Show");
            }
        };
        obj.show();
    }
}