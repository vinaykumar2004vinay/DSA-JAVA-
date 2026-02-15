class A
{
    public void show()
    {
        for(int i=1;i<=5;i++)
        {
            System.out.println("Hii");
        }
    }
}

class B
{
    public void show()
    {
        for(int i=1;i<=5;i++)
        {
            System.out.println("Hello");
        }
    }
}

public class one
{
    public static void main(String[] args)
    {
        A obj1 = new A();
        B obj2 = new B();

        obj1.show();
        obj2.show();
    }
}