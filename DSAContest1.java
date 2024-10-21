public class DSAContest1 {
    public static void main(String[] args) {
        
    }

    /*
     * count the pairs for which the XOR of ith Bit resulted in one.
     * You have to answer for Q queries given in array B,
     * each query B[i] denotes the index for which you need to 
     * find the count of pairs with XOR of that index equals 1.
     * A[]={2,4,7,11} B[]={3}
     * Query with index = 3 means we have to find the total pairs whose XOR have index bit Set.
     * the pairs are {[2,11],[4,11],[7,11]}
     */
    public int[] solve(int[] A, int[] B) {
        int n=B.length;
        int res[]=new int[n];
        for(int i=0;i<n;i++)
        {
            int count1=0,count0=0,m=A.length;
            for(int j=0;j<m;j++)
            {
                if(checkBit(A[j],B[i]))
                    count1++;
                else
                    count0++;
            }
            res[i]=count1*count0;
        }
        return res;
    }
    public static boolean checkBit(int N, int idx)
    {
        if((N & (1<<idx))!=0)
            return true;
        return false;
    }
}
