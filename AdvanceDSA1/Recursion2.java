package AdvanceDSA1;
public class Recursion2
{
    public static void main(String[] args)
    {
        System.out.println(power(2,10));
        int[] arr={10,20,30,40,50};
        printArray(arr,0);
    }
    private static int power(int a,int n)
    {
        if(n==0)
            return 1;
        else 
        {
            int val=power(a,n/2);
            if(n%2==0)
                return val*val;
            else
                return val*val*a;
        }
    }
    private static void printArray(int[] a,int index)
    {
        if(index==a.length)
            return;
        System.out.println(a[index]);
        printArray(a,index+1);
    }
    private static int[] findAll(int[] A,int B,int Index, int count)
    {
        if(index==A.length)
            return new int[count];
        if(A[index]==B)
            count++;
        int[] ans=findAll(A,B,index+1,count);
    }
}
