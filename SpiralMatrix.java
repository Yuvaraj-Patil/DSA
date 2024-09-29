package IntermediateDSA2;

class SpiralMatrix {
    public static void main(String[] args) {
        int A=5;
        int[][] ans=new int[A][A];
        int i=0,j=0,count=1;
        
        while(A>=1)
        {
            if(A==1)
                ans[i][j]=count;
            for(int k=1;k<A;k++)
            {
                ans[i][j]=count;
                j++;count++;
            }
            for(int k=1;k<A;k++)
            {
                ans[i][j]=count;
                i++;count++;
            }
            for(int k=1;k<A;k++)
            {
                ans[i][j]=count;
                j--;count++;
            }
            for(int k=1;k<A;k++)
            {
                ans[i][j]=count;
                i--;count++;
            }
            i++;j++;
            A-=2;
        }    
        System.out.println(ans);
    }    
}