public class BeggersProb {
    public static void main(String[] args) {
        int A=5;
        int[][] B={{1,2,10},{2,3,20},{2,5,25}};
        int[] ans=new int[A];
        for(int i=0;i<B.length;i++)
        {
            int l=B[i][0],r=B[i][1],amt=B[i][2];
            ans[l-1]=ans[l-1]+amt;
            if(r<A)
                ans[r]=ans[r]-amt;
        } 
        for(int i=1;i<A;i++)
        {
            ans[i]+=ans[i-1];
        }
        System.out.println(ans); 
    }
}
