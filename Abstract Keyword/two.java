abstract class car
{
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
}

public class two
{
    public static void main(String[] args)
    {
        BMW obj = new BMW();
        obj.Drive();
        obj.PlayMusic();
    }
}