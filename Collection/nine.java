import java.util.Iterator;
import java.util.Set;
import java.util.TreeSet;

public class nine
{
    public static void main(String[] args)
    {
        Set<Integer> nums = new TreeSet<Integer>();

        nums.add(82);
        nums.add(53);
        nums.add(24);
        nums.add(65);

        Iterator<Integer> values = nums.iterator();
        while (values.hasNext())
        {
            System.out.println(values.next());       
        }
    }
}