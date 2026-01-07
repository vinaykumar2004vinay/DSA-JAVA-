class Calc
{
    int z = 5;
    public int add(int x,int y)
    {
        System.out.println(z);
        return x+y;
    }
}

public class three
{
    public static void main(String[] args)
    {
        Calc obj = new Calc();
        int r1 = obj.add(10,20);

        System.out.println(r1);
    }
}