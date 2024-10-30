import java.util.*;

public class Hashing 
{
    public static void main(String[] args)
    {
        System.out.println(lengthOfLongestSubstring("bbbbbbb"));
        System.out.println(subArraySumZero(new ArrayList<>(Arrays.asList(new Integer[]{-15,-12,-13,5,-20,1,2,3,4,5,6,7,8,9,10,-25,-55}))));
        System.out.println(countOfSubArraySumEqlToB(new ArrayList<>(Arrays.asList(new Integer[]{-14,-9,12,7,-12,-4,7,25,-5,48,33,-49,36,-31,-48,36,36,17,13,-47,-39,37,-20,35,38,26,-40,-43,36,-48,-33,-30,6,-28,11,27,22,18,-21,-11,-50,34,-21,44,-25,17,34,-12,14,26,30})), 16));
    }    

    /*
     * Determine the "GOOD"ness of a given string A, where the "GOOD"ness is defined by the length 
     * of the longest substring that contains no repeating characters. The greater the length of this 
     * unique-character substring, the higher the "GOOD"ness of the string.
     * Your task is to return an integer representing the "GOOD"ness of string A.
     */
    public static int lengthOfLongestSubstring(String A) 
    {
        HashSet<Character> ch=new HashSet<>();
        int len=0,currLen=0;
        for(Character c: A.toCharArray())
        {
            if(!ch.contains(c))
            {
                currLen++;
                ch.add(c);                
            }             
            else
            {
                len=Math.max(len, currLen);
                currLen=0;
            }          
        }
        len=Math.max(len, currLen);
        return len;
    }

    /*
     * You are given an array A of N integers and an integer B.
     * Count the number of pairs (i,j) such that A[i] - A[j] = B and i ≠ j.
     * Since the answer can be very large, return the remainder after dividing the count with 109+7.
     */
    public static int solve(ArrayList<Integer> A, int B) {
        HashMap<Integer,Integer> hm=new HashMap<>();
        int count=0;
        for(Integer a:A)
        {
            if(hm.containsKey(a-B))
            {
                count+=(hm.get(a-B)%1000000007);
            }
            if(hm.containsKey(a+B))
            {
                count+=(hm.get(a+B)%1000000007);
            }
            if(hm.containsKey(a))
            {
                hm.put(a,hm.get(a)+1);                
            }
            else
            {
                hm.put(a,1);
            }
        }
        return count%1000000007;
    }

    /*
     * Given an array of integers A, find and return whether the given array contains a non-empty 
     * subarray with a sum equal to 0. If the given array contains a sub-array with sum zero return 1,
     * else return 0.
     */
    public static int subArraySumZero(ArrayList<Integer> A) 
    {
        HashSet<Long> hs=new HashSet<>();
        long sum=0;
        hs.add(0l);
        for(Integer a:A)
        {
            sum+=a;
            if(hs.contains(sum))
            {
                return 1;
            }
            else
            {
                hs.add(sum);
            }
        }
        return 0;
    }

    /*
     * Given an array of integers A and an integer B.
     * Find the total number of subarrays having sum equals to B.
     */
    public static int countOfSubArraySumEqlToB(ArrayList<Integer> A,int B)
    {
        HashMap<Integer,Integer> hm=new HashMap<>();
        int sum=0;
        int count=0;
        hm.put(B,1);
        for(Integer a:A)
        {
            sum+=a;
            if(hm.containsKey(sum-B))
            {
                count+=hm.get(sum-B); 
            }
            else if(hm.containsKey(sum))
            {
                hm.put(sum,hm.get(sum)+1);
            }
            else
            {
                hm.put(sum,1);
            }
        }
        return count;
    }
}
