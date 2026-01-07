class calculator
{
    public int add(int x,int y)
    {
        int r = x+y;
        return r;
    }
}

public class six
{
    public static void main(String[] args)
    {
        int num1 = 10;
        int num2 = 20;
        calculator obj = new calculator();
        int r1 = obj.add(num1,num2);
        System.out.println(r1);
    }
}