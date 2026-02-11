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

public class one
{
    public static void main(String[] args)
    {
        A obj = new A();
        obj.show();
    }
}