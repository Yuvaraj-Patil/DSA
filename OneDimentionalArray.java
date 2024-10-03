public class OneDimentionalArray 
{
    public static void main(String[] args) 
    {
        BeggersProblem();
        System.out.println(maxSubArray(new int[]{-2, 1, -3, 4, -1, 2, 1, -5, 4}));
        System.out.println(waterTrapped(new int[]{5, 4, 1, 4, 3, 2, 7}));
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
        for (int[] B1 : B) {
            int L = B1[0];
            int R = B1[1];
            int P = B1[2];
            resArray[L-1]=resArray[L-1]+P;
            if(R<A)
                resArray[R]=resArray[R]-P;
        }
        for(int i=1;i<A;i++)
            resArray[i]=resArray[i-1]+resArray[i];
        for(int i=0;i<A;i++)
            System.out.print(resArray[i]+" ");
    }
    
    /*
     * Find the maximum sum of contiguous non-empty subarray within an array A of length N.
     */
    public static int maxSubArray(final int[] A) 
    {
        int maxSubArraySum=Integer.MIN_VALUE,curr_sum=0;
        for(int a:A)
        {
            curr_sum+=a;            
            maxSubArraySum=Math.max(maxSubArraySum,curr_sum);
            if(curr_sum<0)
            {
                curr_sum=0;
            }
        }
        return maxSubArraySum;
    }

    /*
     * Imagine a histogram where the bars' heights are given by the array A. Each bar is of uniform width, 
     * which is 1 unit. When it rains, water will accumulate in the valleys between the bars.
     * Your task is to calculate the total amount of water that can be trapped in these valleys.
     */
    public static int waterTrapped(final int[] A) {
        int n=A.length, result=0;
        int[] maxL=new int[n];
        int[] maxR=new int[n];
        maxL[0]=A[0];
        maxR[n-1]=A[n-1];
        for(int i=1;i<n;i++)
        {
            maxL[i]=Math.max(maxL[i-1],A[i]);
            maxR[n-i-1]=Math.max(maxR[n-i],A[n-i-1]);   
        }
        for(int i=1;i<n-1;i++)
        {
            int x=Math.min(maxL[i-1],maxR[i+1])-A[i];
            if(x>0)
                result+=x;            
        }
        return result;
    }
}
