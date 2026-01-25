class Mobile
{
    String Brand;
    int Price;
    String Network;
}

public class two
{
    public static void main(String[] args)
    {
        Mobile obj1 = new Mobile();
        obj1.Brand = "Apple";
        obj1.Price = 75000;
        obj1.Network = "Jio";

        Mobile obj2 = new Mobile();
        obj2.Brand = "Samsung";
        obj2.Price = 57000;
        obj2.Network = "Aitel";

        Mobile obj3 = new Mobile();
        obj3.Brand = "Vivo";
        obj3.Price = 28000;
        obj3.Network = "Bsnl";

        System.out.println(obj1.Brand + " : " + obj1.Price + " : " + obj1.Network);
        System.out.println(obj2.Brand + " : " + obj2.Price + " : " + obj2.Network);
        System.out.println(obj3.Brand + " : " + obj3.Price + " : " + obj3.Network);
    }
}