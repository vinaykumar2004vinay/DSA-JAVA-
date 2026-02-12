class computer
{
    public void code()
    {

    }
}

class Laptop extends computer
{
    public void code()
    {
        System.out.println("Codeing");
    }
}

class Desktop extends computer
{
    public void code()
    {
        System.out.println("Coding,error");
    }
}

class developer
{
    public void devapp(computer com)
    {
        com.code();
    }
}

public class seven
{
    public static void main(String[] args)
    {
        computer lap = new Laptop();
        computer desk = new Desktop();

        developer obj = new developer();
        obj.devapp(desk);
    }
}