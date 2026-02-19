import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;

public class eight
{
    public static void main(String args[])
    {
        List<Integer> num = Arrays.asList(3,6,9,4,5,8);
        num.forEach(n -> System.out.println(n));
    }
}