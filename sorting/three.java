import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class three
{
    public static void main(String[] args)
    {
        List<Integer> num = new ArrayList<>();

        num.add(91);
        num.add(43);
        num.add(65);
        num.add(28);

        Collections.sort(num);

        System.out.println(num);
    }
}