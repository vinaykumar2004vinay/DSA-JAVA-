class Human
{
    private int Age;
    private String Name;

    public int abc()
    {
        return Age;
    }
    public String xyz()
    {
        return Name;
    }

    public void setAge(int a)
    {
        Age = a;
    }
    public void setName(String n)
    {
        Name = n;
    }
}

public class six
{
    public static void main(String[] args)
    {
        Human obj = new Human();
        obj.setAge(21);
        obj.setName("Vinay");
        System.out.println(obj.abc() + " : " + obj.xyz());
    }
}