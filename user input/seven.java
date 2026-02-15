import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class seven
{
    public static void main(String[] args) throws NumberFormatException , IOException
    {
        int num = 0;
        try(BufferedReader B = new BufferedReader(new InputStreamReader(System.in)))
        {
            num = Integer.parseInt(B.readLine());
            System.out.println(num);
        }
    }
}