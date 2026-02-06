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

class C extends A
{
    public void show()
    {
        System.out.println("In C Show");
    }
}

public class one
{
    public static void main(String[] args)
    {
        A obj1 = new A();
        obj1.show();

        B obj2 = new B();
        obj2.show();

        C obj3 = new C();
        obj3.show();
    }
}