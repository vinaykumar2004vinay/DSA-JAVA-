class calculator
{
    public int add(int x,int y)
    {
        int r = x+y;
        return r;
    }
}

public class five
{
    public static void main(String[] args)
    {
        calculator obj = new calculator();
        int r1 = obj.add(10,20);
        System.out.println(r1);
    }
}