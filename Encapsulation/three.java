class Human
{
    private int Age = 21;
    private String Name = "Vinay";

    public int getAge()
    {
        return Age;
    }
    public String getName()
    {
        return Name;
    }
}

public class three
{
    public static void main(String[] args)
    {
        Human obj = new Human();
        System.out.println(obj.getAge());
        System.out.println(obj.getName());
    }
}