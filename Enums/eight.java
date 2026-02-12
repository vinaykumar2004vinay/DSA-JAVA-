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

public class eight
{
    public static void main(String[] args)
    {
        for(laptop lap : laptop.values())
        {
            System.out.println(lap + " : " + lap.getPrice());
        }
    }
}