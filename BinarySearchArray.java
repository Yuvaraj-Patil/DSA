public class BinarySearchArray
{
    public static void main(String[] args) {
        solve(new int[]{1,1,7});
        OneDimentionalArray.printArray(searchRange(new int[]{1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 4, 4, 4, 4, 4, 4, 4, 4, 4, 4, 4, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 6, 6, 6, 6, 6, 6, 6, 6, 6, 6, 6, 6, 6, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 8, 8, 8, 8, 8, 8, 8, 8, 9, 9, 9, 9, 9, 9, 9, 9, 9, 9, 9, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10},10));
    }

    /*
     * Given a sorted array of integers A where every element appears twice except for one element which appears once, 
     * find and return this single element that appears only once.
     * Elements which are appearing twice are adjacent to each other.
     */
    public static int solve(int[] A) {
        int l=0,r=A.length-1;
        while(l<=r)
        {
            int m=(l+r)/2;
            if(m==0 || ((l==r) && (A[m]!=A[m-1])) || ((A[m]!=A[m-1]) &&(A[m]!=A[m+1])) )
            {
                return A[m];                
            }
            else if(A[m]!=A[m-1])
            {
                if(m%2==0)
                    l=m+2;
                else
                    r=m-1;
            }
            else
            {
                m=m-1;
                if(m%2==0)
                    l=m+2;
                else
                    r=m-1;
            }
        }
        return -1;
    }

    /*
     * Given a sorted array of integers A (0-indexed) of size N, find the left most and the right most index of a given integer B in the array A.
     * Return an array of size 2, such that 
     *           First element = Left most index of B in A
     *           Second element = Right most index of B in A.
     * If B is not found in A, return [-1, -1].
     */
    public static int[] searchRange(final int[] A, int B) {
        int l=0,n=A.length, r=n-1;
        int[] ans= new int[]{-1,-1};
        while(l<=r)
        {
            int m=(l+r)/2;
            if(A[m]==B)
            {
                int k=m;
                ans[0]=m;                
                while(k<n && A[k]==B)
                    ans[1]=k++;
                r=m-1;               
            }
            else if(A[m]<B)
            {
                l=m+1;
            }
            else
            {
                r=m-1;
            }
        }
        return ans;
    }
}