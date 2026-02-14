class A 
{
    public void show()
    {
        try
        {
            Class.forName("three");
        }
        catch(ClassNotFoundException e)
        {
            System.out.println("Not able to find a class" + " - " + e);
        }
    }
}

public class three
{
    public static void main(String[] args)
    {
        A obj = new A();
        obj.show();
    }
}