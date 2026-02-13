class A 
{
    public void ShowTheDataBelongsThisClass()
    {
        System.out.println("A show");
    }
}

class B extends A
{
    @Override
    public void ShowTheDataBelongsThisClass()
    {
        System.out.println("B show");
    }
}

public class one
{
    public static void main(String[] args)
    {
        B obj = new B();
        obj.ShowTheDataBelongsThisClass();
    }
}