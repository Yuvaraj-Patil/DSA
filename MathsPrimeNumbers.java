import java.util.ArrayList;

public class MathsPrimeNumbers {

    static int S[], SZ, NP = 1001001;

    public static void main(String[] args) {
        
    }
    
    static void sieve() 
    {
        int n = NP;
        S = new int[n];
        for(int i = 1; i < n; i++) 
            S[i] = i;
        for(int i = 2; i * i <= n; i++) {
            if( S[i] != i )
                continue;
            for(int j = i * i; j < n; j += i) {
                if(S[j] == j)
                    S[j] = i;
            }
        }
    }
        
    static int countDivisors(int x) 
    {
        // Using prime factorization to get the number of divisors for every integer
        int ans = 1;
        while(S[x] > 1) {
            int cnt = 1, u = S[x];
            while(S[x] == u) {
                cnt++;
                x /= u;
            }
            ans *= cnt;
        }
        return ans;    
    }
                
    /*
        * Given an array of integers A, find and return the count of divisors of each element of the array.
        * NOTE: The order of the resultant array should be the same as the input array.
        */
    public static int[] countOfDivisorsArray(int[] a) 
    {
        sieve();
        int n = a.length;
        int ans[] = new int[n];
        for(int i = 0; i < n; i++)
            ans[i] = countDivisors(a[i]);
        return ans;
    }

    /*
     * Given an integer A. Find the list of all prime numbers in the range [1, A].
     */
    public static ArrayList<Integer> solve(int A) {
        boolean[] isPrime = new boolean[A + 1];
        ArrayList<Integer> primes = new ArrayList<>();

        // Initialize the isPrime array
        for (int i = 2; i <= A; i++) {
            isPrime[i] = true;
        }

        // Sieve of Eratosthenes
        for (int i = 2; i * i <= A; i++) {
            if (isPrime[i]) {
                for (int j = i * i; j <= A; j += i) {
                    isPrime[j] = false;
                }
            }
        }

        // Collecting all prime numbers
        for (int i = 2; i <= A; i++) {
            if (isPrime[i]) {
                primes.add(i);
            }
        }

        return primes;
    }
}
