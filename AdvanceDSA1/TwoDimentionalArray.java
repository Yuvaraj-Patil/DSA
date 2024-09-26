package AdvanceDSA1;

public class TwoDimentionalArray
{
    public static void main(String[] args) 
    {
        SearchInMatrix();
        int[][] result=GenerateSpiralMatrix(9);
        print2DMatrix(result);
    }
    /*
     * Given a matrix of integers A of size N x M and an integer B. In the given matrix every row and 
     * column is sorted in non-decreasing order. Find and return the position of B in the matrix in the 
     * given form: 
     * If A[i][j] = B then return (i * 1009 + j) 
     * If B is not present return -1.
     * Note 1: Rows are numbered from top to bottom and columns are numbered from left to right.
     * Note 2: If there are multiple B in A then return the smallest value of i*1009 +j such that A[i][j]=B.
     * Note 3: Expected time complexity is linear
     * Note 4: Use 1-based indexing
     */
    private static void SearchInMatrix()
    {
        int A[][]={{1,2,3},{4,5,6},{7,8,9}},B=2;
        int n=A.length,m=A[0].length;
        for(int i=0;i<n;i++)
        {
            for(int j=0;j<m;j++)
            {
                if(A[i][j]==B)
                {
                    System.out.println(++i * 1009+ ++j);
                    return;
                }
            }
        }
        System.out.println(-1);
    }
    /*
     * Given an integer A, generate a square matrix filled with elements from 1 to A2 in spiral order 
     * and return the generated square matrix.
     * Input 3:
     * [ [1, 2, 3], 
         [8, 9, 4],
         [7, 6, 5] ]
     */  
    private static int[][] GenerateSpiralMatrix(int A)
    {
        int ele=1;
        int resArray[][]=new int[A][A];        
        int i=0,j=0;
        while(A>0)
        {
            if(A==1)
                resArray[i][j]=ele;            
            for(int k=1;k<A;k++,j++) 
            {
                resArray[i][j]=ele++;
            }
            for(int k=1;k<A;k++,i++)
            {
                resArray[i][j]=ele++;
            } 
            for(int k=1;k<A;k++,j--)
            {
                resArray[i][j]=ele++;
            }
            for(int k=1;k<A;k++,i--)
            {
                resArray[i][j]=ele++;
            }
            i++;j++;
            A-=2;
        }         
        return resArray; 
    }
    public static void print2DMatrix(int[][] array)
    {
        for(int i=0;i<array.length;i++)
        {
            for(int j=0;j<array[0].length;j++)
            {
                System.out.print(array[i][j]+" ");
            }
            System.out.println();
        }
    }
}