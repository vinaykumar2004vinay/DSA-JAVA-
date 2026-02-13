interface A
{
    int Add(int i,int j);
}

public class ten
{
    public static void main(String[] args)
    {
        A obj = new A()
        {
            public int Add(int i,int j)
            {
                return i+j;
            }
        };
        int result = obj.Add(3,4);
        System.out.println(result);
    }
}