class A 
{
    public void show() throws ClassNotFoundException
    {
        Class.forName("demo");
    }
}

public class four
{
    static
    {
        System.out.println("Loading..");
    }

    public static void main(String[] args)
    {
        A obj = new A();
        try
        {
            obj.show();
        } 
        catch (ClassNotFoundException e) 
        {
            e.printStackTrace();
        }
    }
}