abstract class car
{
    public abstract void Drive();
    public abstract void fly();
    public void PlayMusic()
    {
        System.out.println("Playing Music...");
    }
}

class BMW extends car
{
    public void Drive()
    {
        System.out.println("Driving...");
    }

    public void fly()
    {
        System.out.println("Flying...");
    }
}

public class three
{
    public static void main(String[] args)
    {
        BMW obj = new BMW();
        obj.Drive();
        obj.fly();
        obj.PlayMusic();
    }
}