import java.util.ArrayList;
import java.util.Arrays;

public class MathsCombinators {
    public static void main(String[] args) {
        TwoDimentionalArray.print2DMatrix(pascalTriangle(5));
        System.out.println(convertToTitle1(26));
        System.out.println(convertToTitle1(52));
        System.out.println(compute_nCrModM(41,27,143));
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

    /*
     * Given a positive integer A, return its corresponding column title as it appears in an Excel sheet.
     */
    public static String convertToTitle1(int A) {
        StringBuilder result = new StringBuilder(); 
        while (A > 0) 
        { 
            A--; // Decrease n by 1 to handle the zero-indexed nature 
            result.insert(0, (char)('A' + A % 26)); 
            A /= 26; 
        } 
        return result.toString();
    }

    public static String convertToTitle2(int n) 
    { 
        if (n == 0) 
        return ""; 
        n--; // Decrease n by 1 to handle the zero-indexed nature 
        return convertToTitle2(n / 26) + (char)('A' + n % 26);
    }

    /*
     * Given three integers A, B, and C, where A represents n, B represents r, and C represents m, 
     * find and return the value of nCr % m where nCr % m = (n!/((n-r)!*r!))% m.
     */
    public static int compute_nCrModM(int A,int B,int C)
    {
        if(B==0 || A==B) 
            return 1; 
        int[] row = new int[B+1]; 
        Arrays.fill(row, 1); 
        for(int i=1;i<A;i++)
        {
            for(int j=Math.min(i,B);j>0;j--)
                row[j] = (row[j] + row[j-1]) % C;            
        } 
        return row[B]; 
    }

}
