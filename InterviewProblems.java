import java.util.*;

public class InterviewProblems 
{
    public static void main(String[] args) 
    {
        ArrayList<ArrayList<Integer>> res=new ArrayList();
        ArrayList<Integer> interval=new ArrayList();
        interval.add(1);
        interval.add(6);
        res.add(interval);
        interval=new ArrayList();
        interval.add(2);
        interval.add(6);
        res.add(interval);
        interval=new ArrayList();
        interval.add(8);
        interval.add(10);
        res.add(interval);
        interval=new ArrayList();
        interval.add(15);
        interval.add(18);
        res.add(interval);
        solve(res);
    }    
    public static  ArrayList<ArrayList<Integer>> solve(ArrayList<ArrayList<Integer>> A) {
        int n=A.size();
        int start=A.get(0).get(0);
        int end=A.get(0).get(1);
        for(int i=1;i<n;i++)
        {
            if(A.get(i).get(0)<=end)
            {
                start=Math.min(start,A.get(i).get(0));
                end=Math.max(end,A.get(i).get(1));
                A.get(i).set(0,start);
                A.get(i).set(1,end);
                A.remove(i-1);
                i--;
            }
            else
            {
                start=A.get(i).get(0);
                end=A.get(i).get(1);
            }
        }
        return A;
    }
}
