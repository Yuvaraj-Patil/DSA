package IntermediateDSA2;

public class kthElemnt {
    public static void main(String[] args) {
        System.out.println(solve(2,1));
    }
    public static int solve(int A, long B) {
        if(A==1)
            return 0;
        long mid=(long)Math.pow(2,A-1)/2;
        if(B<mid)
            return solve(A-1,B);
        else
        {
            return (solve(A-1,B-mid)==0)?1:0;
        }
    }
}
