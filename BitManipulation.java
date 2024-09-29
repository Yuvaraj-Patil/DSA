

public class BitManipulation {
    public static void main(String[] args) {
        System.out.println(numSetBits(125));
        System.out.println(singleNumber(new int[]{5,2,4,1,3,5,4,3,1}));
        System.out.println(unsetBthBit(5,2));
        System.out.println(toggleBthBit(10, 3));
        System.out.println(checkBit(20, 4));
        System.out.println(SetAB_Bits(6, 4));
    }
    /*
     * Write a function that takes an integer and returns the number of 1 bits present in its binary representation.
     */
    public static int numSetBits(int A) {
        int count=0;
        while(A>0)
        {
            if((A&1)==1)
            {
                count++;
            }
            A=A>>1;
        }
        return count;
    }

    /*
     * Given an array of integers A, every element appears twice except for one. Find that integer that occurs once.
     */
    public static int singleNumber(final int[] A) {
        int res=A[0],n=A.length;        
        for(int i=1;i<n;i++)
        {
            res^=A[i];
        }
        return res;
    }

    /*
     * You are given two integers A and B. 
     * If B-th bit in A is set, make it unset.
     * If B-th bit in A is unset, leave as it is.
     * Return the updated A value.
     */
    public static int unsetBthBit(int A, int B) 
    {        
        return (A & ~(1<<B));
    }        

    /*
      * You are given two integers A and B.
      * If B-th bit in A is set, make it unset
      * If B-th bit in A is unset, make it set
      * Return the updated A value
      */
    public static  int toggleBthBit(int A, int B) 
    {
        return A^(1<<B);
    }
    
    /*
     * You are given two integers A and B.
     * Return 1 if B-th bit in A is set
     * Return 0 if B-th bit in A is unset
     */
    public static int checkBit(int A,int B)
    {
        if((A&(1<<B))>0)
        {
            return 1;
        }
        return 0;
    }

    /*
     * You are given two integers A and B.
     * Set the A-th bit and B-th bit in 0, and return output in decimal Number System.
     */
    public static int SetAB_Bits(int A, int B) {
        return (1<<A|1<<B);
    }
}
