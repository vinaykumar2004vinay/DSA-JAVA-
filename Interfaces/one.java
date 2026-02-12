interface A
{
    void show1();
    void show2();
}

class B implements A
{
    public void show1()
    {
        System.out.println("In Show1");
    }

    public void show2()
    {
        System.out.println("In Show2");
    }
}

public class one
{
    public static void main(String[] args)
    {
        B obj = new B();
        obj.show1();
        obj.show2();
    }
}