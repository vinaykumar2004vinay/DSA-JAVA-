class Human
{
    int Age;
    String Name;
}

public class one
{
    public static void main(String[] args)
    {
        Human obj = new Human();
        obj.Age = 21;
        obj.Name = "Vinay";

        System.out.println(obj.Age);
        System.out.println(obj.Name);
    }
}