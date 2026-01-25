class Mobile
{
    String Brand;
    int Price;
    String Network;

    public void show()
    {
        System.out.println(Brand + " : " + Price + " : " + Network);
    }

    public static void show1(Mobile.obj)
    {
        System.out.println(obj.Brand + " : " + obj.Price + " : " + Network);
    }
}

public class six
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

        obj1.show();
        obj2.show();
        obj3.show();

        Mobile.show1(obj1);
        Mobile.show1(obj2);
        Mobile.show1(obj3);
    }
}