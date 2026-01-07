class Calculator
{
    public int add()
    {
        System.out.println("In Add");
        return 0;
    }

    public int sub()
    {
        System.out.println("In Sub");
        return 0;
    }
}

public class two
{
    public static void main(String[] args)
    {
        Calculator obj = new Calculator();
        obj.add();
        obj.sub();
    }
}