import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class two
{
    public static void main(String[] args)
    {
        List<Integer> num = new ArrayList<>();

        num.add(9);
        num.add(4);
        num.add(6);
        num.add(2);

        Collections.sort(num);

        System.out.println(num);
    }
}