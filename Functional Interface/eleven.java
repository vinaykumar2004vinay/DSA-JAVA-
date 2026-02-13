interface A
{
    int Add(int i,int j);
}

public class eleven
{
    public static void main(String[] args)
    {
        A obj = (i,j) -> i+j;

        int result = obj.Add(3,4);
        System.out.println(result);
    }
}