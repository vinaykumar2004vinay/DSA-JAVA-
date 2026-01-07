class Computer
{
    public void Music()
    {
        System.out.println("Playing Music....");
    }

    public void Game()
    {
        System.out.println("Temple Run....");
    }

    public String Movies()
    {
        return "Og";
    }
}

public class seven
{
    public static void main(String[] args)
    {
        Computer obj = new Computer();
        obj.Music();
        obj.Game();
        String r = obj.Movies();
        System.out.println(r);
    }
}