abstract class car
{
    public abstract void Drive();
    public abstract void fly();
    public void PlayMusic()
    {
        System.out.println("Playing Music...");
    }
}

abstract class BMW extends car
{
    public void Drive()
    {
        System.out.println("Driving...");
    }
}

class NewBMW extends BMW
{
    public void fly()
    {
        System.out.println("Flying..");
    }
}

public class four
{
    public static void main(String[] args)
    {
        BMW obj = new NewBMW();
        obj.Drive();
        obj.PlayMusic();
        obj.fly();
    }
}