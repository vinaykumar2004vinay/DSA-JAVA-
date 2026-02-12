enum laptop
{
    Hp(50000),Dell(65000),Lenovo(47000),Apple(87000);

    private int price;

    private laptop(int price)
    {
        this.price = price;
    }

    public int getPrice()
    {
        return price;
    }

    public void setPrice(int price)
    {
        this.price = price;
    }   
}

public class seven
{
    public static void main(String[] args)
    {
        laptop obj = laptop.Hp;
        System.out.println(obj + " : " + obj.getPrice());
    }
}