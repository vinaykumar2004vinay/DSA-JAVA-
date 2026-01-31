class Human
{
    private int Age;
    private String Name;

    public int getAge()
    {
        return Age;
    }
    public String getName()
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

public class five
{
    public static void main(String[] args)
    {
        Human obj = new Human();
        obj.setAge(21);
        obj.setName("Vinay");
        System.out.println(obj.getAge() + " : " + obj.getName());
    }
}