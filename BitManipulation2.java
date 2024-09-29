package AdvanceDSA;

import java.util.ArrayList;
import java.util.Arrays;

public class BitManipulation2 {
    public static void main(String[] args) {
        int[] A={2,5,6,5,4,2,6};
        System.out.println(findUniqNum(A));
        System.out.println(findUniqNumByBit(A));
        Integer[] arr={2308,1447,1918,1391,2308,216,1391,410,1021,537,1825,1021,1729,669,216,1825,537,1995,805,410,805,602,1918,1447,90,1995,90,1540,1161,1540,2160,1235,1161,602,880,2160,1235,669};
        ArrayList<Integer> input=new ArrayList<>(Arrays.asList(arr));
        System.out.println(findTwoUniqNum(input));
        Integer[] array={13,18,23,56,81,20,4,24,93};
        System.out.println(maxANDPair(new ArrayList<Integer>(Arrays.asList(array))));
        Integer[] inp={1,2,3,4,5};
        System.out.println(subArrOR(new ArrayList<Integer>(Arrays.asList(inp))));
    }
    public static int findUniqNum(int[] A)
    {
        int ans=0;
        for(int i=0;i<A.length;i++)
        {
            ans^=A[i];
        }
        return ans;
    }
    public static int findUniqNumByBit(int[] A)
    {
        int ans=0;
        for(int i=0;i<32;i++)
        {
            int count=0;
            for(int j=0;j<A.length;j++)
            {
                if((A[j]&(1<<i))>0)
                {
                    count++;
                }
            }
            if((count&1)==1)
            {
                ans=ans|(1<<i);
            }
        }
        return ans;
    }
    public static ArrayList<Integer> findTwoUniqNum(ArrayList<Integer> A) {
        int xorvalue=0,n=A.size();        
        for(int i=0;i<n;i++)
            xorvalue^=A.get(i);
        int pos=0,temp=xorvalue;
        while(temp>0){
            if((temp & 1)==1)
            {
                break;
            }
            temp=temp>>1;
            pos++;
        }
        int num1=0,num2=0;
        for(int i=0;i<n;i++)
        {
            int d=A.get(i);
            if((d&(1<<pos))>0)
            {
                num1^=d;
            }
            else
            {
                num2^=d;
            }
        }
        ArrayList<Integer> ans=new ArrayList();
        ans.add(num1);ans.add(num2);
        return ans;
    }
    public static int maxANDPair(ArrayList<Integer> A) {
        int ans;
        for(int i=31;i>=0;i--)
        {
            int count=0;
            int n=A.size();
            for(int j=0;j<n;j++)
            {
                if((A.get(j)&(1<<i))>0)
                {
                    count++;
                }
            }
            if(count>=2 && n>=2)
            {
                for(int j=0;j<A.size();j++)
                {
                    if((A.get(j)&(1<<i))>0)
                        continue;
                    else
                        A.remove(j--);
                }                
            }
        }
        return A.get(0)&A.get(1);
    }
    public static int subArrOR(ArrayList<Integer> A) {
        int n=A.size(),subArr=(n*(n+1))/2;
        long ans=0;
        for(int i=0;i<32;i++)
        {
            int totalCount=0,count=0;
            for(int j=0;j<n;j++)
            {
                if((A.get(j)&(1<<i))==0)
                {
                    count++;
                }
                else
                {
                    totalCount+=(count*(count+1))/2;
                    count=0;
                }                
            }
            if(count!=0)
                  totalCount+=(count*(count+1))/2;
            ans=(ans+((subArr-totalCount)*((long)Math.pow(2,i)%1000000007)%1000000007))%1000000007;
        }
        ans=(long)Math.pow(2,31);
        return (int)ans;
  }
}
//1729,880
     