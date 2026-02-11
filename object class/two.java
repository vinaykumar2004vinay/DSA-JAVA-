class Laptop
{
    String Model;
    int Price;

    public String toString()
    {
        return Model + " : " + Price;
    }
}

class two
{
    public static void main(String[] args)
    {
        Laptop obj = new Laptop();
        obj.Model = "Hp";
        obj.Price = 65000;
        System.out.println(obj);
    }
}