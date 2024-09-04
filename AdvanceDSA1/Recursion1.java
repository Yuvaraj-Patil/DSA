package AdvanceDSA1;
public class Recursion1{
    public static void Main(String[] args)
    {
        System.out.println(Sum(8));
        System.out.println(Fact(10));
        Increasing(9);
    }
    private static int Sum(int n)
    {
        if(n==0)
            return 0;
        return Sum(n-1)+n;
    }
    private static int Fact(int n)
    {
        if(n==0)
            return 1;
        return Fact(n-1)*n;
    }
    private static void Increasing(int A)
    {
        if(A==0)
            return;
        Increasing(A-1);
        System.out.print(A+" ");
    }
}