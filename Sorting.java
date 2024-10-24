public class Sorting { 
    public static void main(String args[]) 
    { 
        int arr[] = { 12, 11, 13, 5, 6, 7 }; 
        System.out.println("Given array is"); 
        printArray(arr); 
        sort(arr, 0, arr.length - 1); 
        System.out.println("\nSorted array is"); 
        printArray(arr); 
        System.out.println("\nSorted Colors are"); 
        printArray(sortColors(new int[]{0, 1, 2, 0, 1, 2, 0}));
    }
    // Merges two subarrays of arr[]. 
    // First subarray is arr[l..m] 
    // Second subarray is arr[m+1..r] 
    static void merge(int arr[], int l, int m, int r) 
    { 
        // Find sizes of two subarrays to be merged 
        int n1 = m - l + 1; 
        int n2 = r - m; 
        // Create temp arrays 
        int L[] = new int[n1]; 
        int R[] = new int[n2]; 
        // Copy data to temp arrays 
        for (int i = 0; i < n1; ++i) 
            L[i] = arr[l + i]; 
        for (int j = 0; j < n2; ++j) 
            R[j] = arr[m + 1 + j]; 
        // Merge the temp arrays 
        // Initial indices of first and second subarrays 
        int i = 0, j = 0; 
        // Initial index of merged subarray array 
        int k = l; 
        while (i < n1 && j < n2) 
        { 
            if (L[i] <= R[j]) 
            { 
                arr[k] = L[i]; 
                i++; 
            } 
            else 
            { 
                arr[k] = R[j]; 
                j++; 
            } 
            k++; 
        } 
        // Copy remaining elements of L[] if any 
        while (i < n1) 
        { 
            arr[k] = L[i]; 
            i++; k++; 
        } 
        // Copy remaining elements of R[] if any 
        while (j < n2) 
        { 
            arr[k] = R[j]; 
            j++; k++; 
        } 
    } 
    // Main function that sorts arr[l..r] using // merge() 
    static void sort(int arr[], int l, int r) 
    { 
        if (l < r) 
        { 
            // Find the middle point 
            int m = l + (r - l) / 2; 
            // Sort first and second halves 
            sort(arr, l, m); 
            sort(arr, m + 1, r); 
            // Merge the sorted halves 
            merge(arr, l, m, r); 
        } 
    } 
    // A utility function to print array of size n 
    static void printArray(int arr[]) 
    { 
        int n = arr.length; 
        for (int i = 0; i < n; ++i) 
            System.out.print(arr[i] + " "); 
        System.out.println(); 
    }      

    /*
     * Given an array with N objects colored red, white, or blue, sort them so that objects 
     * of the same color are adjacent, with the colors in the order red, white, and blue.
     * We will represent the colors as, red -> 0 , white -> 1 and blue -> 2
     */
    public static int[] sortColors(int[] A) 
    {
        int n = A.length;
        int lo = 0,mid=0,hi = n - 1;

        // Iterate till all the elements are sorted
        while (mid <= hi) 
        {
            if (A[mid] == 0) 
            {
                swap(A, mid, lo);
                lo++;
                mid++;
            }
            else if (A[mid] == 1) 
            {
                mid++;
            }
            else 
            {
                swap(A, mid, hi);
                hi--;
            }
        }
        return A;
    }
    public static void swap(int[] arr,int i,int j)
    {
        int temp=arr[i];
        arr[i]=arr[j];
        arr[j]=temp;
    }
}