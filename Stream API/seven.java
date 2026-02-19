import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;

public class seven
{
    public static void main(String args[])
    {
        List<Integer> num = Arrays.asList(3,6,9,4,5,8);

        Consumer<Integer> C = n -> System.out.println(n);
        num.forEach(C);
    }
}