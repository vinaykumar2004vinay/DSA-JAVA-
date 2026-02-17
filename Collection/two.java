import java.util.ArrayList;
import java.util.Collection;

class two
{
    public static void main(String[] args)
    {
        Collection<Integer> nums = new ArrayList<Integer>();

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