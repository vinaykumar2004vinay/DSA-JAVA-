class Calculator
{
    public int add()
    {
        System.out.println("In Add");
        return 10;
    }

    public int sub()
    {
        System.out.println("In Sub");
        return 20;
    }
}

public class three
{
    public static void main(String[] args)
    {
        Calculator obj = new Calculator();
        int result1 = obj.add();
        int result2 = obj.sub();

        System.out.println(result1);
        System.out.println(result2);
    }
}