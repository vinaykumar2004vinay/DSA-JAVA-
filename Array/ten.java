class ten
{
    public static void main(String[] args)
    {
        int n[][] = new int[3][4];

        for(int i=0;i<3;i++)
        {
            for(int j=0;j<4;j++)
            {
                n[i][j] = (int)(Math.random()*10);
                System.out.print(n[i][j] + " ");
            }
            System.out.println();
        }
    }
}