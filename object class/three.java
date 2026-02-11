class Laptop
{
    String Model;
    int Price;

    public String toString()
    {
        return Model + " : " + Price;
    }
}

class three
{
    public static void main(String[] args)
    {
        Laptop obj1 = new Laptop();
        obj1.Model = "Hp";
        obj1.Price = 65000;

        Laptop obj2 = new Laptop();
        obj2.Model = "Lenovo";
        obj2.Price = 43000;

        System.out.println(obj1);
        System.out.println(obj2);
    }
}