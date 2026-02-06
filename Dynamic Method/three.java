class A
{
    public void show()
    {
        System.out.println("In A Show");
    }
}

class B extends A
{
    public void show()
    {
        System.out.println("In B Show");
    }
}

class C extends B
{
    public void show()
    {
        System.out.println("In C Show");
    }
}

public class three
{
    public static void main(String[] args)
    {
        C obj = new C();
        obj.show();
    }
}