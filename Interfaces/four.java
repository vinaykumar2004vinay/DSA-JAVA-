interface A
{
    int price = 1000;
    String loc = "Pune";

    void show1();
    void show2();
}

interface x extends A
{
    void run();
}

interface y extends x
{

}

class B implements y
{
    public void show1()
    {
        System.out.println("In Show1");
    }

    public void show2()
    {
        System.out.println("In Show2");
    }

    public void run()
    {
        System.out.println("Running");
    }
}

public class four
{
    public static void main(String[] args)
    {
        B obj = new B();
        obj.show1();
        obj.show2();
        obj.run();

        System.out.println(A.price);
        System.out.println(A.loc);
    }
}