import java.util.*;

public class Hashing 
{
    public static void main(String[] args)
    {
        String str="Wnb9z9dMc7E8v1RTUaZPoDNIAXRlzkqLaa97KMWLzbitaCkRpiE4J4hJWhRcGnC8H6mwasgDfZ76VKdXhvEYmYrZY4Cfmf4HoSlchYWFEb1xllGKyEEmZOLPh1V6RuM7Mxd7xK72aNrWS4MEaUmgEn7L4rW3o14Nq9l2EN4HH6uJWljI8a5irvuODHY7A7ku4PJY2anSWnfJJE1w8p12Ks3oZRxAF3atqGBlzVQ0gltOwYmeynttUmQ4QBDLDrS4zn4VRZLosOITo4JlIqPD6t4NjhHThOjJxpMp9fICkrgJeGiDAwsb8a3I7Txz5BBKV9bEfMsKNhCuY3W0ZHqY0MhBfz1CbYCzwZZdM4p65ppP9s5QJcfjadmMMi26JKz0TVVwvNA8LP5Vi1QsxId4SI19jfcUH97wmZu0pbw1zFtyJ8GAp5yjjQTzFIboC1iRzklnOJzJld9TMaxqvBNBJKIyDjWrdfLOY8FGMOcPhfJ97Dph35zfxYyUf4DIqFi94lm9J0skYqGz9JT0kiAABQZDazZcNi80dSSdveSl6h3dJjHmlK8qHIlDsqFd5FMhlEirax8WA0v3NDPT8vPhwKpxcnVeu14Gcxr3h1wAXXV0y7Xy9qqB2NQ5HQLJ7cyXAckEYHsLCPSy28xcdNJatx1KLWohOQado4WywJbGvsFR17rKmvOPABweXnFD3odrbSMD4Na4nuBBswvMmFRTUOcf7jZi4z5JnJqXz6hitaPnaEtjoSEBq82a52nvqYy7hhldBoxen2et2OMadVEHeTYLL7GLsIhTP6UizHIuzcJMljo4lFgW5AyrfUlIBPAlhwaSiJtTvcbVZynDSM6RO1PqFKWKg2MHIgNhjuzENg2oFCfW7z5KJvEL9qWqKzZNc0o3BMRjS04NCHFvhtsteQoQRgz84XZBHBJRdekCdcVVXu9c01gYRAz7oIAxN3zKZb64EFKssfQ4HW971jv3H7x5E9dAszA0HrKTONyZDGYtHWt4QLhNsIs8mo4AIN7ecFKewyvGECAnaJpDn1MTTS4yTgZnm6N6qnmfjVt6ZU51F9BxH0jVG0kovTGSjTUkmb1mRTLQE5mTlVHcEz3yBOh4WiFFJjKJdi1HBIBaDL4r45HzaBvmYJPlWIomkqKEmQ4rLAbYG7C5rFfpMu8rHvjU7hP0JVvteGtaGn7mqeKsn7CgrJX1tb8t0ldaS3iUy8SEKAo5IZHNKOfEaij3nI4oRVzeVOZsH91pMsA4jRYgEohubPW8ciXwVrFi1qEWjvB8gfalyP60n1fHyjsiLW0T5uY1JzQWHKCbLVh7QFoJFAEV0L516XmzIo556yRH1vhPnceOCjebqgsmO78AQ8Ir2d4pHFFHAGB9lESn3OtJye1Lcyq9D6X93UakA3JKVKEt6JZDLVBMp4msOefkPKSw59Uix9d9kOQm8WCepJTangdNSOKaxblZDNJ5eHvEroYacBhd9UdafEitdF3nfStF7AhkSfQVC61YWWkKTNdx96OoJGTnxuqt4oFZNFtO7aMuN3IJAkw3m3kgZFRGyd3D3wweagNL9XlYtvZwejbjpkDOZz33C0jbEWaMEaUPw6BG49XqyQoUwtriguO0yvWyaJqD4ye3o0E46huKYAsdKAq6MLWMxF6tfyPVaoqOGd0eOBHbAF89XXmDd4AIkoFPXkAOW8hln5nXnIWP6RBbfEkPPbxoToMbV";
        System.out.println(lenLongestNonRepeatingSubstring(str));
        System.out.println(lengthOfLongestSubstring(str));
        System.out.println(subArraySumZero(new ArrayList<>(Arrays.asList(new Integer[]{-15,-12,-13,5,-20,1,2,3,4,5,6,7,8,9,10,-25,-55}))));
        System.out.println(countOfSubArraySumEqlToB(new ArrayList<>(Arrays.asList(new Integer[]{-14,-9,12,7,-12,-4,7,25,-5,48,33,-49,36,-31,-48,36,36,17,13,-47,-39,37,-20,35,38,26,-40,-43,36,-48,-33,-30,6,-28,11,27,22,18,-21,-11,-50,34,-21,44,-25,17,34,-12,14,26,30})), 16));
    }    

    /*
     * Determine the "GOOD"ness of a given string A, where the "GOOD"ness is defined by the length 
     * of the longest substring that contains no repeating characters. The greater the length of this 
     * unique-character substring, the higher the "GOOD"ness of the string.
     * Your task is to return an integer representing the "GOOD"ness of string A.
     */
    //Approach 1
    public static int lenLongestNonRepeatingSubstring(String A) 
    {
        HashMap<Character, Integer> hm = new HashMap<>();
        int start = 0;
        int maxLength = 0;

        for (int end = 0; end < A.length(); end++) 
        {
            char currChar = A.charAt(end);
            if (hm.containsKey(currChar) && hm.get(currChar) >= start) 
            {
                start = hm.get(currChar) + 1;
            }
            hm.put(currChar, end);
            maxLength = Math.max(maxLength, end - start + 1);
        }
        
        return maxLength;
    }

    //Approach 2
    public static int lengthOfLongestSubstring(String A) {
        int start = 0,maxLength = 0;

        for (int end = 0; end < A.length(); end++) 
        {
            char currChar = A.charAt(end);
            int index=A.lastIndexOf(currChar,end-1);
            if (index>=start) 
            {
                start = index + 1;
            }            
            maxLength = Math.max(maxLength, end - start + 1);
        }
        
        return maxLength;
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
