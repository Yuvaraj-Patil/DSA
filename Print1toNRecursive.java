package IntermediateDSA2;

public class Print1toNRecursive {
    public static void main(String[] args) {
        solve(9);
        System.out.println();
    }
    public static void solve(int A) {
        if(A==0){
            return;
        }
        solve(A-1);
        System.out.print(A+" ");
    }
}
