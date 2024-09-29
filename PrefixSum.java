public class PrefixSum {
    public static void main(String[] args) {
        
    }
    public static long[] solve(int[] a,int[][] b) {
        long ans[]=new long[b.length];
        long perfSum[]=new long[a.length];
        for(int i=0;i<a.length;i++)
        {
            perfSum[i]=i==0?perfSum[i]:perfSum[i-1]+a[i];
        }
        for(int i=0;i<b.length;i++)
        {
            ans[i]=perfSum(perfSum, b[i][0], b[i][0]);
        }
        return ans;
    }
    private static long perfSum(long[] a,int start,int end)
    {
        if(start==0)
            return a[end];
        else
            return a[end]-a[start-1];
    }
    public static long[] evenPrefSum(int[] a,int[][] b) {
        long ans[]=new long[b.length];
        long perfSum[]=new long[a.length/2];
        perfSum[0]=a[0];
        for(int i=2,j=0;i<a.length/2;i+=2,j++)
        {
            perfSum[j]=perfSum[j-1]+a[i];
        }
        for(int i=0;i<b.length;i++)
        {
            ans[i]=perfSum(perfSum, b[i][0]/2, b[i][0]/2);
        }
        return ans;
    }
}
