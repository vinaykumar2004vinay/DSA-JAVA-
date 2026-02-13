class eight
{
    public static void main(String args[])
    {
        int i = 2;
        int j = 0;

        int nums[] = new int[5];
        String s = "Vinay";

        try
        {
            j = 18/i;
            System.out.println(s.length());
            System.out.println(nums[1]);
            System.out.println(nums[5]);
        }

        catch(ArithmeticException e)
        {
            System.out.println("Cannot divide by 0...");
        }

        catch(ArrayIndexOutOfBoundsException e)
        {
            System.out.println("Stay in your limit...");
        }

        catch(Exception e)
        {
            System.out.println("Something Went Wrong...");
        }

        System.out.println(j);
        System.out.println("Byee");
    }
}