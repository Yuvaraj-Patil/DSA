package IntermediateDSA2;
public class TestCode{
    static int bar(int x,int y)
    {
        if(y==0) return 0;
        return (x+bar(x,y-1));
    }
    static int foo(int x,int y)
    {
        if(y==0) return 1;
        return bar(x,foo(x,y-1));
    }
    static int fun(int x,int n)
    {
        if(n==0)
            return 1;
        else if(n%2==0)
            return fun(x*x,n/2);
        else
            return x* fun(x*x,(n-1)/2);
    }
    public static void main(String[] args) {
        System.out.println(foo(3,5));
        System.out.println(fun(2,10));
        System.out.println();
    }
}