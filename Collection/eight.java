import java.util.Collection;
import java.util.TreeSet;

class eight
{
    public static void main(String[] args)
    {
        Collection<Integer> nums = new TreeSet<Integer>();

        nums.add(82);
        nums.add(53);
        nums.add(24);
        nums.add(65);

        for(int n : nums)
        {
            System.out.println(n);
        }
    }
}