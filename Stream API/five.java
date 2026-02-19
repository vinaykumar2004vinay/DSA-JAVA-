import java.util.Arrays;
import java.util.List;

public class five
{
    public static void main(String args[])
    {
        List<Integer> num = Arrays.asList(3,6,9,4,5,8);
        num.forEach(n -> System.out.println(n));
    }
}