package IntermediateDSA2;

public class power {
    public static void main(String[] args) {
        System.out.println(pow(71045970, 41535484, 64735492));
    }
    public static int pow(int A, int B, int C) {
        // Just write your code below to complete the function. Required input is available to you as the function arguments.
        // Do not print the result or any output. Just return the result via this function.
        if(A==0)    return 0;
        if(B==0) return 1;
        long p=pow(A,B/2,C);
        p=p*p%C;
        if(B%2==1)
            p=(A*p)%C;
        p=(C+p)%C;
        return (int)p;
    }
}
