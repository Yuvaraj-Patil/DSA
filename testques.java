
public class testques {
    public static void main(String[] args) {
        int[] A={2,37,35,21,20,38,10,41,8,15,14,28,23,7,17,33,9,34,25,27,4,5,19,40,1,24,29,11,26,30,13,16,6,32,36,39,18,12,3,22,31};
        int n=A.length,ans=0;
        for(int i=0;i<n;i++)
        {
            if(A[i]%7==0)
            {
                int l=i-1,r=i+1,count=0;
                while(l>=0 || r<n)
                {
                    if(l>=0 && A[l]>A[i])
                        count++;
                    if(r<n && A[r]>A[i])
                        count++;
                    if(count==2)
                    {
                        ans++;
                        break;
                    }
                    l--;r++;
                }
            }
        }
        System.out.println(ans); 
    }
}
