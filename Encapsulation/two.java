class Human
{
    int Age;
    String Name;

    public void show()
    {
        System.out.println("Age = " + 21);
        System.out.println("Name = " + "Vinay");
    }
}

public class two
{
    public static void main(String[] args)
    {
        Human obj = new Human();
        obj.show();
    }
}