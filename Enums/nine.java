enum laptop
{
    Hp(50000),Dell(65000),Lenovo,Apple(87000);

    private int price;

    private laptop()
    {
        price = 500;
    }

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

public class nine
{
    public static void main(String[] args)
    {
        for(laptop lap : laptop.values())
        {
            System.out.println(lap + " : " + lap.getPrice());
        }
    }
}