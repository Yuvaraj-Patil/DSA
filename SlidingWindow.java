import java.util.ArrayList;
import java.util.Scanner;

public class SlidingWindow {
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        ArrayList<Integer> A = new ArrayList<Integer>();
        int n=sc.nextInt();
        for (int i=0;i<n;i++){
            A.add(sc.nextInt());
        }
        int B=sc.nextInt(),C=sc.nextInt(),sum=0;        
        for(int i=0;i<B;i++)
        {
            sum+=A.get(i);
        }
        for(int i=B,j=1;i<n;i++,j++)
        {
            sum=sum-A.get(j-1);
            sum+=A.get(i);
            if(sum==C)
            {
                System.err.println( true);
                return;
            }
        }
        System.err.println( false);
    }
}
