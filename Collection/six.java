import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;

class six
{
    public static void main(String[] args)
    {
        Set<Integer> nums = new HashSet<Integer>();

        nums.add(8);
        nums.add(5);
        nums.add(2);
        nums.add(6);

        for(int n : nums)
        {
            System.out.println(n);
        }
    }
}