class Calculator
{
    public int add(int x,int y)
    {
        return x+y;
    }

    public int sub(int x,int y)
    {
        return x-y;
    }
}

public class four
{
    public static void main(String[] args)
    {
        Calculator obj = new Calculator();
        int r1 = obj.add(10,20);
        int r2 = obj.sub(30,5);

        System.out.println(r1);
        System.out.println(r2);
    }
}