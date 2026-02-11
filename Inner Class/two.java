class A
{
    int Age;

    public void show()
    {
        System.out.println("In A Show");
    }

    class B
    {
        public void show1()
        {
            System.out.println("In B Show");
        }
    }
}

public class two
{
    public static void main(String[] args)
    {
        A obj1 = new A();
        obj1.show();

        A.B obj2 = obj1.new B();
        obj2.show1();
    }
}