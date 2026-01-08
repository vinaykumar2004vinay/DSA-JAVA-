class nine
{
    public static void main(String[] args)
    {
        int n[][] = new int[3][4];
        n[0][0] = 1;
        n[0][1] = 2;
        n[0][2] = 3;
        n[0][3] = 4;

        n[1][0] = 11;
        n[1][1] = 12;
        n[1][2] = 13;
        n[1][3] = 14;

        n[2][0] = 21;
        n[2][1] = 22;
        n[2][2] = 23;
        n[2][3] = 24;

        for(int i=0;i<3;i++)
        {
            for(int j=0;j<4;j++)
            {
                System.out.print(n[i][j] + " ");
            }
            System.out.println();
        }
    }
}