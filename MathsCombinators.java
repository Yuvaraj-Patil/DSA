public class MathsCombinators {
    public static void main(String[] args) {
        TwoDimentionalArray.print2DMatrix(pascalTriangle(5));
    }

    //Write a program to print the pascal triangle up to A rows.
    public static int[][] pascalTriangle(int n)
    {
        int[][] pasc =new int[n][n];
        for(int i=0;i<n;i++)
        {
            pasc[i][0]=1;
            pasc[i][i]=1;
            for(int j=1;j<i;j++)
            {
                pasc[i][j]=pasc[i-1][j]+pasc[i-1][j-1];
            }
        }
        return pasc;
    }

}
