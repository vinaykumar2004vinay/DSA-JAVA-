import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

class three
{
    public static void main(String[] args) throws IOException
    {
        System.out.println("Enter A Number");

        InputStreamReader In = new InputStreamReader(System.in);
        BufferedReader Bf = new BufferedReader(In);

        int num = Integer.parseInt(Bf.readLine());
        System.out.println(num);
    }
}