class Mobile
{
    String Brand;
    int Price;
    String Network;
}

public class one
{
    public static void main(String[] args)
    {
        Mobile obj1 = new Mobile();
        obj1.Brand = "Apple";
        obj1.Price = 75000;
        obj1.Network = "Jio";
        System.out.println(obj1.Brand + " : " + obj1.Price + " : " + obj1.Network);
    }
}