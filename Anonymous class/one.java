class A
{
    public void show()
    {
        System.out.println("In A Show");
    }
}

public class one
{
    public static void main(String[] args)
    {
        A obj = new A()
        {
           public void show()
           {
            System.out.println("In New A Show");
           }
        };
        obj.show();
    }
}