class Mobile
{
    String Model;
    int Price;
    static String Network;

    static
    {
        Network = "Jio";
        System.out.println("In Static Method");
    }

    public Mobile()
    {
        Model = "";
        Price = 15000;
        System.out.println("In Constructer");
    }
}

public class five
{
    public static void main(String[] args)
    {
        Mobile obj1 = new Mobile();
        Mobile obj2 = new Mobile();
    }
}