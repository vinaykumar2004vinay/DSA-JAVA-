import java.util.ArrayList;
import java.util.Collection;

class four
{
    public static void main(String[] args)
    {
        Collection nums = new ArrayList();

        nums.add(8);
        nums.add(5);
        nums.add(2);
        nums.add(6);

        for(Object n : nums)
        { 
            int num = (Integer)n;
            System.out.println(num*2);
        }
    }
}