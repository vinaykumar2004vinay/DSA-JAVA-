@FunctionalInterface
interface A
{
    void show();
}

public class three
{
    public static void main(String[] args)
    {
        A obj = () ->    //Lambda Expression
            {
                System.out.println("In Show");
            };
        obj.show();
    }
}