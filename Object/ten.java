class Computer
{
    public void Music()
    {
        System.out.println("Playing Music....");
    }

    public String Movies(int ticket)
    {
        String S = (ticket >=150)?"Enter" : "Not Enter";
        return S;
    }
}

public class ten
{
    public static void main(String[] args)
    {
        Computer obj = new Computer();
        obj.Music();
        String S = obj.Movies(150);
        System.out.println(S);
    }
}