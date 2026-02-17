import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;

class seven
{
    public static void main(String[] args)
    {
        Set<Integer> nums = new HashSet<Integer>();

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