import java.util.ArrayList;

public class test{
    public static void main(String[] args) {
        ArrayList<Integer> A=new ArrayList<Integer>();
        A.add(1);A.add(-2);A.add(0);
        ArrayList<ArrayList<Integer>> B=new ArrayList();
        B.add(new ArrayList<Integer>());
        B.add(new ArrayList<Integer>());
        B.get(0).add(0);
        B.get(0).add(2);
        B.get(1).add(1);
        B.get(1).add(2);
        ArrayList<Integer> ans=new ArrayList();
        ArrayList<Integer> prefix_Count=new ArrayList();
        if(A.get(0)>=0)
            prefix_Count.add(1);
        else
            prefix_Count.add(0);
        for(int i=1;i<A.size();i++)
        {
            if(A.get(i)>=0){
            prefix_Count.add(prefix_Count.get(i-1)+1);
            }
            else{
                prefix_Count.add(prefix_Count.get(i-1));
            }
        }
        for(int i=0;i<B.size();i++)
        {
            int l=B.get(i).get(0),r=B.get(i).get(1);
            if(l==0)
                ans.add(prefix_Count.get(r));
            else
                ans.add(prefix_Count.get(r)-prefix_Count.get(l-1));
        }
        System.out.println(ans);
    }
}
