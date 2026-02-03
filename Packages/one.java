import pack.Calc;
import pack.Advcalc;

class one
{
    public static void main(String[] args)
    {
        Calc obj1 = new Calc();
        Advcalc obj2 = new Advcalc();
        int r1 = obj1.add(2,3);
        int r2 = obj2.multi(5,3);
        System.out.println(r1);
        System.out.println(r2);
    }
}
