package IntermadiateDSA;

import java.util.Scanner;

public class FactorOfNumber {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        System.out.println("Number of Factors: "+numberOfFactors(n));
        System.out.println("Number is Prime: "+checkPrimeNum(n));
        sc.close();
    }
    private static int numberOfFactors(int n)
    {
        int count=0;
        for(int i=1;i<=Math.sqrt(n);i++)
        {
            if(i*i==n)
                count++;
            else if(n%i==0)
                count+=2;
        }
        return count;
    }
    private static boolean checkPrimeNum(int n)
    {
        if(numberOfFactors(n)==2)
            return true;
        return false;
    }
}
