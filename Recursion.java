public class Recursion{
    public static void Main(String[] args)
    {
        System.out.println(Sum(8));
        System.out.println(Fact(10));
        Increasing(9);
        System.out.println(power(2,10));
        int[] arr={10,20,30,40,50};
        printArray(arr,0);
        fibonaccii(12);
    }
    public static int Sum(int n)
    {
        if(n==0)
            return 0;
        return Sum(n-1)+n;
    }
    public static int Fact(int n)
    {
        if(n==0)
            return 1;
        return Fact(n-1)*n;
    }
    public static void Increasing(int A)
    {
        if(A==0)
            return;
        Increasing(A-1);
        System.out.print(A+" ");
    }

    public static int power(int a,int n)
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
    public static void printArray(int[] a,int index)
    {
        if(index==a.length)
            return;
        System.out.println(a[index]);
        printArray(a,index+1);
    }

    public static int fibonaccii(int n)
    {
        if(n<2)
            return n;
        return fibonaccii(n-1)+fibonaccii(n-1);
    }
    // public static int[] findAll(int[] A,int B,int index, int count)
    // {
    //     if(index==A.length)
    //         return new int[count];
    //     if(A[index]==B)
    //         count++;
    //     int[] ans=findAll(A,B,index+1,count);        
    // }
}