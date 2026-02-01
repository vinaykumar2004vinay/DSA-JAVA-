class A
{
    public A()
    {
        System.out.println("Object");
    }
    
    public void show()
    {
        System.out.println("In A Show");
    }
}

public class two
{
    public static void main(String[] args)
    {
        new A();
    }
}