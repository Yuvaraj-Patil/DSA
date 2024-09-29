package AdvanceDSA;

import java.lang.*;
import java.util.*;
public class PrimeNumber {
    public static void main(String[] args) {
        System.out.println(printPrimes(759701));
    }
    public static ArrayList<Integer> printPrimes(int A) {
        ArrayList<Integer> ans=new ArrayList();
        ArrayList<Integer> res=new ArrayList();
        ans.add(0);
        ans.add(0);
        for(int i=2;i<=A;i++)
            ans.add(i);
        for(int i=2;i<=Math.sqrt(A);i++)
        {
            for(int j=i*i;j<=A;j+=i)
            {
                if(ans.get(j)%i==0)
                {
                    ans.set(j,0);
                }
            }
        }
        for(int i=0;i<=A;i++)
        {
            if(ans.get(i)!=0)
                res.add(i);
        }
        return res;
    }
}
