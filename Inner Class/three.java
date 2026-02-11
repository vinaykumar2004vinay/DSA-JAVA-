class A
{
    int Age;

    public void show()
    {
        System.out.println("In A Show");
    }

    static class B
    {
        public void show1()
        {
            System.out.println("In B Show");
        }
    }
}

public class three
{
    public static void main(String[] args)
    {
        A obj1 = new A();
        obj1.show();

        A.B obj2 = new A.B();
        obj2.show1();
    }
}