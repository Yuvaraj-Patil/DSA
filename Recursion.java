public class Recursion
{
    public static void main(String[] args)
    {
        System.out.println(Sum(8));
        System.out.println(Fact(10));
        increasing(9);
        System.out.println();
        decreasing(9);
        System.out.println();
        DecThenInc(16);
        System.out.println();
        System.out.println(power(2,10));
        int[] arr={10,20,30,40,50};
        printArray(arr,0);
        System.out.println(fibonaccii(12));
        System.out.println(checkPalindrome("ana", 0, 2));
        int[] ans=findAll(new int[]{2,5,7,1,5,3,5},5,0,0);
        for (int i : ans) 
        {
            System.out.print(i+" ");
        }
    }

    /*
     * Sum of Numbers from 1 to n
     */
    public static int Sum(int n)
    {
        if(n==0)
            return 0;
        return Sum(n-1)+n;
    }

    /*
     * Write a program to find the factorial of the given number A using recursion.
     */
    public static int Fact(int n)
    {
        if(n==0)
            return 1;
        return Fact(n-1)*n;
    }

    /*
     * You are given an integer A, print 1 to A using using recursion.
     */
    public static void increasing(int A)
    {
        if(A==1)   
        {         
            System.out.print(A+" ");
            return;
        }       
        increasing(A-1);        
        System.out.print(A+" "); 
    }

    /*
     * You are given an integer A, print A to 1 using using recursion.
     */
    public static void decreasing(int A)
    {
        if(A==1)   
        {         
            System.out.println(A+" ");
            return;
        }
        System.out.print(A+" ");        
        decreasing(A-1);         
    }

    /*
     * Given two positive integers A and B. Implement Fast Power function to compute A^B
     */
    public static int power(int a,int n)
    {
        if(n==0)
            return 1;
        else 
        {
            int val=power(a,n/2);
            if(n%2==0)
                return val*val;
            else
                return val*val*a;
        }
    }

    /*
     * You are given an array A. Print the elements of the array using recursion.
     */
    public static void printArray(int[] a,int index)
    {
        if(index==a.length)
            return;
        System.out.println(a[index]);
        printArray(a,index+1);
    }

    /*
     * The Fibonacci numbers are the numbers in the following integer sequence.
     * 0, 1, 1, 2, 3, 5, 8, 13, 21, 34, 55, 89, 144, ……..
     * In mathematical terms, the sequence Fn of Fibonacci numbers is defined by the recurrence relation:
     * Fn = Fn-1 + Fn-2
     * Given a number A, find and return the Ath Fibonacci Number using recursion.
     * Given that F0 = 0 and F1 = 1.
     */
    public static int fibonaccii(int n)
    {
        if(n<2)
            return n;
        return fibonaccii(n-1)+fibonaccii(n-1);
    }

    /*
     * Given a number A, we need to find the sum of its digits using recursion.
     */
    public int sumOfDigitsOfA(int A) {
        if(A==0)
            return 0;        
        return A%10+sumOfDigitsOfA(A/10);
    }

    /*
     * Print N numbers in Decreasing Order and then in Increasing Order.
     * You are given a positive number N.
     * You are required to print the numbers from N to 1.
     * You are required to not use any loops. 
     */
    public static void DecThenInc(int A)
    {
        if(A==0)
            return;
        System.out.print(A+" ");
        DecThenInc(A-1);
        System.out.print(A+" ");
    }

    /*
     * Given an array of integers A with N elements and a target integer B, 
     * the task is to find all the indices at which B occurs in the array.
     */
    public static int[] findAll(int[] A,int B,int index, int count)
    {
        if(index==A.length)
            return new int[count];
        if(A[index]==B)
        {
            int arr[]=findAll(A,B,index+1,count+1);
            arr[count]=index;
            return arr;
        }
        else
        {
            int arr[]= findAll(A,B,index+1,count);   
            return arr;
        }     
    }

    /*
     * Write a recursive function that checks whether string A is a palindrome or Not.
     * Return 1 if the string A is a palindrome, else return 0.
     */
    public static int checkPalindrome(String str,int s,int e)
    {
        if(s>e)
            return 1;
        if(Character.compare(str.charAt(s),str.charAt(e))!=0)
            return 0;
        return checkPalindrome(str, s+1, e-1);
    }
}