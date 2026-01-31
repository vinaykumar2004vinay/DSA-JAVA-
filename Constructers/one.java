class Human
{
    private int Age;
    private String Name;

    public Human()
    {
        Age = 21;
        Name = "Vinay";
    }

    public int getAge()
    {
        return Age;
    }
    public String getName()
    {
        return Name;
    }

    public void setAge(int Age)
    {
        this.Age = Age;
    }
    public void setName(String Name)
    {
        this.Name = Name;
    }
}

public class one
{
    public static void main(String[] args)
    {
        Human obj = new Human();
        System.out.println(obj.getAge() + " : " + obj.getName());
    }
}