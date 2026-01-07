class Calc
{
    int z = 5;
}

public class five
{
    public static void main(String[] args)
    {
        Calc obj1 = new Calc();
        Calc obj2 = new Calc();
        obj1.z = 8;

        System.out.println(obj1.z);
        System.out.println(obj2.z);
    }
}