import java.util.Arrays;
import java.util.List;

public class two
{
    public static void main(String args[])
    {
        List<Integer> num = Arrays.asList(3,6,9,4,5,8);

        int sum = 0;

        for(int n : num)
        {
            if(n%2==0)
            {
                n = n*2;
                sum = sum+n;
            }
        }

        System.out.println(sum);
    }
}