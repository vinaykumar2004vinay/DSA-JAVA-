import java.util.Arrays;
import java.util.List;

public class three
{
    public static void main(String args[])
    {
        List<Integer> num = Arrays.asList(3,6,9,4,5,8);
        for(int i=0;i<num.size();i++)
        {
            System.out.println(num.get(i));
        }
    }
}