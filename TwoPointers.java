public class TwoPointers {
    public static void main(String[] args) {
        int[] arr={1,2,3,4,5,6,7,8};
        System.out.println(pairSum(arr, 10));
        int[] array={1,2,2,5,5,5,5,5,8,8,8,9};
        System.out.println(pairSumCount(array, 10));
        arr=new int[]{-6,-3,0,1,2,3,5,6,8,9};
        System.out.println(pairDiff(arr, 5));

    }

    public static boolean pairSum(int[] arr, int k)
    {
        int left=0,right=arr.length-1,sum;
        while(left<right)
        {
            sum=arr[left]+arr[right];
            if(sum==k)
                return true;
            else if(sum>k)
                right--;
            else
                left++;
        }
        return false;
    }

    public static int pairSumCount(int[] arr, int k)
    {
        int left=0,right=arr.length-1,sum,count=0;
        while(left<right)
        {
            sum=arr[left]+arr[right];
            if(sum==k)
            {
                if(arr[left]==arr[right])
                {
                    int c=right-left+1;
                    count+=(c*(c-1))/2;
                    break;
                }
                int c1=1,c2=1;
                while(left<right && arr[left]==arr[left+1])
                {
                    c1++;
                    left++;
                }
                while(left<right && arr[right]==arr[right-1])
                {
                    c2++;
                    right--;
                }
                count+=(c1*c2);
                left++;
                right--;
            }
            else if(sum>k)
                right--;
            else
                left++;
        }
        return count;
    }

    public static boolean pairDiff(int[] arr, int k)
    {
        int left=0,right=1,diff,n=arr.length;
        while(right<n)
        {
            diff=arr[right]-arr[left];
            if(diff==k)
                return true;
            else if(diff>k)
                left++;
            else
                right++;
        }
        return false;
    }


    public static int[] sumWithSubarray(int arr,int k)
    {
        
    }
}
