public class ModuloArithmeticAndGCD {
    public static void main(String[] args) {
        System.out.println(GCD(-7,-4));
    }
    public static int GCD(int a,int b)
    {
        if(b==0)
            return Math.abs(a);
        return GCD(b,a%b);
    }
}
