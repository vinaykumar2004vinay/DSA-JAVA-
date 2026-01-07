class Calc
{
    public int add(int x,int y,int z)
    {
        return x+y+z;
    }
    public int add(int x,int y)
    {
        return x+y;
    }
    public double add(double x,int y)
    {
        return x+y;
    }
}

public class two
{
    public static void main(String[] args)
    {
        Calc obj = new Calc();
        int r1 = obj.add(10,20,30);
        int r2 = obj.add(10,20);
        double r3 = obj.add(10.245,20);

        System.out.println(r1);
        System.out.println(r2);
        System.out.println(r3);
    }
}