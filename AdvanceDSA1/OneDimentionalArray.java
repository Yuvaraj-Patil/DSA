package AdvanceDSA1;

public class OneDimentionalArray 
{
    public static void main(String[] args) 
    {
        BeggersProblem();
    }
    private static void BeggersProblem()
    {
        int A = 5;
        int[][] B = {{1, 2, 10}, {2, 3, 20}, {2, 5, 25}};
        int[] resArray=new int[A];
        for(int i=0;i<A;i++)
            resArray[i]=0;
        for(int i=0;i<B.length;i++)
        {
            int L=B[i][0],R=B[i][1],P=B[i][2];
            resArray[L-1]=resArray[L-1]+P;
            if(R<A)
                resArray[R]=resArray[R]-P;
        }
        for(int i=1;i<A;i++)
            resArray[i]=resArray[i-1]+resArray[i];
        for(int i=0;i<A;i++)
            System.out.print(resArray[i]+" ");
    }
}
