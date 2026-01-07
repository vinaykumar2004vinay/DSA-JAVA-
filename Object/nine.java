class Computer
{
    public void Music()
    {
        System.out.println("Playing Music....");
    }

    public String Movies(int ticket)
    {
        if(ticket >=150)
        {
            return "You Can Enter";
        }
        else 
        {
            return "You Can't Enter";
        }
    }
}

public class nine
{
    public static void main(String[] args)
    {
        Computer obj = new Computer();
        obj.Music();
        String S = obj.Movies(150);
        System.out.println(S);
    }
}