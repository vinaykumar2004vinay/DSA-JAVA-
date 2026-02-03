import others.A;
import others.B;

public class one
{
    public static void main(String[] args)
    {
        A obj1 = new A();
        B obj2 = new B();

        int r1 = obj1.marks();
        int r2 = obj2.marks();

        System.out.println(r1);
        System.out.println(r2);
    }
}