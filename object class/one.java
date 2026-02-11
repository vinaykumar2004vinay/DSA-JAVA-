class Laptop
{
    String Model;
    int Price;
}

class one
{
    public static void main(String[] args)
    {
        Laptop obj = new Laptop();
        obj.Model = "Hp";
        obj.Price = 65000;
        System.out.println(obj.Model + " : " + obj.Price);
    }
}