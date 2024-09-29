package AdvanceDSA;

public class BitManipulation {
    public static void main(String[] args) {
        System.out.println(checkBit(10));
        System.out.println(createNumber(3,5,4));
        System.out.println(setUnsetNthBit(4,1));
        System.out.println(magicNumber(10));
    }
    private static int checkBit(int A)
    {
        int count=0;
        while(A>0)
        {
            if((A&1)==1)
                count++;
            A=A>>1;
        }
        return count;
    }
    private static long createNumber(int A,int B,int C)
    {
        long ans=0;
        for(int i=0;i<B;i++)
        {
            ans=(ans|(1<<i));
        }
        return ans<<C;
    }
    public static int setUnsetNthBit(int A, int B) {
        return (A^(1<<B));
    }
    public static int magicNumber(int A) {
        int ans=0,i=0;
        while(A>0)
        {
            i++;           
            if((A&1)==1)
                ans+=Math.pow(5,i);
            A=A>>1; 
        }
        return ans;
    }
}

//  000111110000