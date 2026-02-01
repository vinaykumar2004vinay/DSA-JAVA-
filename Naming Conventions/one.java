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

public class one
{
    public static void main(String[] args)
    {
        A obj = new A();
        obj.show();
    }
}