class demo1
{
    public static void main(String[] args)
    {
        int num[][] = new int[3][4];

        for(int i=0;i<num.length;i++)
        {
            for(int j=0;j<num[i].length;j++)
            {
                num[i][j] = (int)(Math.random()*10);
                System.out.print(num[i][j] + " ");
            }
            System.out.println();
        }
    }
}
