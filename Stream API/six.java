import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;

public class six
{
    public static void main(String args[])
    {
        List<Integer> num = Arrays.asList(3,6,9,4,5,8);

        Consumer<Integer> C = new Consumer<Integer>()
        {
            public void accept(Integer n)
            {
                System.out.println(n);
            }
        };
        num.forEach(C);
    }
}