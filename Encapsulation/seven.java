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

    public void setAge(int age)
    {
        Age = age;
    }
    public void setName(String name)
    {
        Name = name;
    }
}

public class seven
{
    public static void main(String[] args)
    {
        Human obj = new Human();
        obj.setAge(21);
        obj.setName("Vinay");
        System.out.println(obj.getAge() + " : " + obj.getName());
    }
}