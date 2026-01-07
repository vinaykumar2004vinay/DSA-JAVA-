class Computer
{
    public void Music()
    {
        System.out.println("Playing Music....");
    }

    public String Movies(int ticket)
    {
        return "Og";
    }
}

public class eight
{
    public static void main(String[] args)
    {
        Computer obj = new Computer();
        obj.Music();
        String S = obj.Movies(100);
        System.out.println(S);
    }
}