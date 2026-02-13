@FunctionalInterface
interface A
{
    void show();
}

class B implements A
{
    public void show()
    {
        System.out.println("In Show");
    }
}

public class one
{
    public static void main(String[] args)
    {
        A obj = new B();
        obj.show();
    }
}