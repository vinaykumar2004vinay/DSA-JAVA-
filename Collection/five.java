import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

class five
{
    public static void main(String[] args)
    {
        List<Integer> nums = new ArrayList<Integer>();

        nums.add(8);
        nums.add(5);
        nums.add(2);
        nums.add(6);

        //System.out.println(nums.get(1));
        System.out.println(nums.indexOf(6));
        
    }
}