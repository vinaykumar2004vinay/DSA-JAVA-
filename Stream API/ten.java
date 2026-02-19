import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;
import java.util.stream.Stream;

public class ten
{
    public static void main(String args[])
    {
        List<Integer> num = Arrays.asList(3,6,9,4,5,8);
        Stream<Integer> S1 = num.stream();
        Stream<Integer> S2 = S1.filter(n -> n%2==0);
        Stream<Integer> S3 = S2.map(n -> n*2);
        S3.forEach(n -> System.out.println(n));
    }
}