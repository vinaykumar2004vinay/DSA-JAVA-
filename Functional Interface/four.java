@FunctionalInterface
interface A
{
    void show();
}

public class four
{
    public static void main(String[] args)
    {
        A obj = () -> System.out.println("In Show");
        obj.show();
    }
}