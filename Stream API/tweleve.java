import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;
import java.util.stream.Stream;

public class tweleve
{
    public static void main(String args[])
    {
        List<Integer> num = Arrays.asList(3,6,9,4,5,8);

        int result = num.stream()
                        .filter(n -> n%2==0)
                        .map(n -> n*2)
                        .reduce(0,(c,e) -> c + e);

        System.out.println(result);
    }
}