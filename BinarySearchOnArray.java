public class BinarySearchOnArray
{
    public static void main(String[] args) {
        System.out.println(solve(new int[]{1,1,7}));
        System.out.println(searchInsert(new int[]{1, 3, 5, 6},5));
        OneDimentionalArray.printArray(searchRange(new int[]{1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 4, 4, 4, 4, 4, 4, 4, 4, 4, 4, 4, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 6, 6, 6, 6, 6, 6, 6, 6, 6, 6, 6, 6, 6, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 8, 8, 8, 8, 8, 8, 8, 8, 9, 9, 9, 9, 9, 9, 9, 9, 9, 9, 9, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10},10));
        System.out.println(findPeakElement(new int[]{5, 17, 100, 11}));
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
     * You are given a sorted array A of size N and a target value B.
     * Your task is to find the index (0-based indexing) of the target value in the array.
     * If the target value is present, return its index.
     * If the target value is not found, return the index of least element greater than equal to B.
     * If the target value is not found and least number greater than equal to target is also not present, 
     * return the length of array (i.e. the position where target can be placed)
     * Your solution should have a time complexity of O(log(N)).
     */
    public static int searchInsert(int[] A, int B) {
        int left = 0, right = A.length - 1;
        
        while (left <= right) {
            int mid = left + (right - left) / 2;
            
            if (A[mid] == B) {
                return mid; // Target found
            } else if (A[mid] < B) {
                left = mid + 1; // Search in the right half
            } else {
                right = mid - 1; // Search in the left half
            }
        }
        
        // If not found, left will be the index of the least element greater than or equal to B
        return left;
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

    /*
     * Given an array of integers A, find and return the peak element in it.
     * An array element is considered a peak if it is not smaller than its neighbors. For corner elements, we need to consider only one neighbor.
     * NOTE:    -It is guaranteed that the array contains only a single peak element.
     *          -Users are expected to solve this in O(log(N)) time. The array may contain duplicate elements.
     */

     public static int findPeakElement(int[] A) {
        int left = 0, right = A.length - 1;
        
        while (left < right) {
            int mid = left + (right - left) / 2;
            
            if (A[mid] > A[mid + 1]) {
                // You are in the decreasing part of the array
                // So the peak is in the left half (including mid)
                right = mid;
            } else {
                // You are in the increasing part of the array
                // So the peak is in the right half (excluding mid)
                left = mid + 1;
            }
        }
        
        // At the end of the loop, left == right and pointing to the peak element
        return A[left];
    }
}