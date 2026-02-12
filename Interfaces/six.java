interface computer
{
    void code();
}

class Laptop implements computer
{
    public void code()
    {
        System.out.println("Codeing");
    }
}

class Desktop implements computer
{
    public void code()
    {
        System.out.println("Coding,error");
    }
}

class developer
{
    public void devapp(computer lap)
    {
        lap.code();
    }
}

public class six
{
    public static void main(String[] args)
    {
        computer lap = new Laptop();
        computer desk = new Desktop();

        developer obj = new developer();
        obj.devapp(desk);
    }
}