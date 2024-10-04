public class makeColRowZero{
    public static void main(String[] args) 
    {
        int[][] A={{51,21,90,38,57,12,11,1,68,60},{81,24,63,97,75,70,23,91,39,84},{0,21,97,12,46,48,50,3,57,69},{44,8,42,34,99,0,98,10,53,67},{23,34,43,86,31,18,9,54,61,48},{90,61,21,87,26,67,88,28,70,45},{98,14,5,92,1,4,44,99,67,98},{18,42,32,61,80,64,32,89,70,93},{89,61,7,10,0,85,29,40,13,0},{85,63,66,43,56,67,99,0,67,66}};
        int row=A.length,col=A[0].length;
        for(int i=0;i<row;i++)
        {
            for(int j=0;j<col;j++)
            {
                if(A[i][j]==0)
                {
                    for(int k=0;k<col;k++)
                    {
                        if(A[i][k]!=0)
                            A[i][k]=-1;
                    }
                    for(int k=0;k<row;k++)
                    {
                        A[k][j]=-1;
                    }                
                }
            }
        }
        for(int i=0;i<row;i++)
        {
            for(int j=0;j<col;j++)
            {
                if(A[i][j]==-1)
                {
                    A[i][j]=0;
                }
            }
        }
        TwoDimentionalArray.print2DMatrix(A);
    }
}