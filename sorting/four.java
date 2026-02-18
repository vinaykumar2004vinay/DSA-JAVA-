import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class four
{
    public static void main(String[] args)
    {
        Comparator<Integer> c = new Comparator<Integer>()
        {
            public int compare(Integer i , Integer j)
            {
                if(i%10 > j%10)
                {
                    return 1;
                }
                else
                {
                    return -1;
                }
            } 
        };

        List<Integer> num = new ArrayList<>();

        num.add(99);
        num.add(43);
        num.add(65);
        num.add(27);

        Collections.sort(num,c);

        System.out.println(num);
    }
}