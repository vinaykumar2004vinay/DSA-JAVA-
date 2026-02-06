final class A 
{
    public void show()
    {
        System.out.println("In A show");
    }

    public void add(int n1,int n2)
    {
        System.out.println(n1+n2);
    }
}

class B extends A
{
    public void show()
    {
        System.out.println("In B show");
    }
}

public class two
{
    public static void main(String[] args)
    {
        B obj = new B();
        obj.show();
        obj.add(2,3);
    }
}