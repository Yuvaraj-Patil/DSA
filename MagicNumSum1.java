public class MagicNumSum1 {
    public static void main(String[] args) {
        System.out.println(MagicNum(83557999));
    }
    public static int MagicNum(int A) {
        int sum=sumOfDigits(A);
        if(sum>9)
        {
            sum=MagicNum(sum);
        }
        if(sum==1)
            return 1;
        return 0;
    }
    public static int sumOfDigits(int A) {
        if(A/10==0)
            return A;
        return sumOfDigits(A/10)+A%10;
    }
}
