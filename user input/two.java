import java.io.IOException;

class two
{
    public static void main(String[] args) throws IOException
    {
        System.out.println("Enter A Number");
        int n = System.in.read();
        System.out.println(n - 48);
    }
}