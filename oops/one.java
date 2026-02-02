class Calc
{
    public int add(int n1,int n2)
    {
        System.out.println(n1+n2);
        return n1 + n2;
    }

    public int sub(int n1,int n2)
    {
        System.out.println(n1-n2);
        return n1 - n2;
    }
}

class AdvCacl extends Calc
{
    public int multi(int n1,int n2)
    {
        System.out.println(n1*n2);
        return n1 * n2;
    }

    public int div(int n1,int n2)
    {
        System.out.println(n1/n2);
        return n1 / n2;
    }
}

public class one
{
    public static void main(String[] args)
    {
        AdvCacl obj = new AdvCacl();
        obj.add(2,3);
        obj.sub(5,2);
        obj.multi(2,3);
        obj.div(10,5);
    }
}