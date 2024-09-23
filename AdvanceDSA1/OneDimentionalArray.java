package AdvanceDSA1;

public class OneDimentionalArray 
{
    public static void main(String[] args) 
    {
        BeggersProblem();
    }
    /*There are A beggars sitting in a row outside a temple. Each beggar initially has an empty pot. 
    When the devotees come to the temple, they donate some amount of coins to these beggars. Each 
    devotee gives a fixed amount of coin(according to their faith and ability) to some K beggars sitting 
    next to each other. Given the amount P donated by each devotee to the beggars ranging from L to R index, 
    where 1 <= L <= R <= A, find out the final amount of money in each beggar's pot at the end of the day, 
    provided they don't fill their pots by any other means. For ith devotee B[i][0] = L, B[i][1] = R, B[i][2] = P, 
    given by the 2D array B*/
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
