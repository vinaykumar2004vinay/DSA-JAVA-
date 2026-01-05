class one
{
    public static void main(String[] args)
    {
        int x = 10;
        int y = 20;

        int a = 800;
        int b = 400;

        //boolean r = x<y && a<b;   //False
        boolean r = x<y && a>b;   //True
        System.out.println(r);
    }
}