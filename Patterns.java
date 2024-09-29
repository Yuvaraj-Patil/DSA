import java.util.Scanner;

public class Patterns
{
    static Scanner sc=new Scanner(System.in);
    public static void main(String[] args) 
    {
        byte n=sc.nextByte();
        int k=n,m;
        for (byte i=1,j;i<=n;i++,k--)
        {
            for (j=1,m=1;j<=n;j++)
            {
                if(j>n-i)
                System.out.print(k*m+++" ");
                else
                System.out.print(0+" ");
            }
            for (j=1;j<n;j++)
            {
                if(j<i)
                System.out.print(k*m+++" ");
                else
                System.out.print(0+" ");
            }
            System.out.println();
        }
        hollowDiamond();
    }
    public static void hollowDiamond()
    {
        System.out.println("Enter n value:");
        int n=sc.nextInt();
        for(int i=0;i<n;i++)
        {
            for(int j=i;j<n;j++)
            {
                System.out.print("* ");
            }
            for(int j=0;j<i*2;j++)
            {
                System.out.print("  ");
            }
            for(int j=i;j<n;j++)
            {
                System.out.print("* ");
            }
            System.out.println("  ");
        }
        for(int i=0;i<n;i++)
        {
            for(int j=n-i-1;j<n;j++)
            {
                System.out.print("* ");
            }
            for(int j=0;j<2*(n-i)-2;j++)
            {
                System.out.print("  ");
            }
            for(int j=n-i-1;j<n;j++)
            {
                System.out.print("* ");
            }
            System.out.println("  ");
        }
        sc.close();
    }
}