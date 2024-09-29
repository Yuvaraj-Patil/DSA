package IntermediateDSA2;

import java.util.ArrayList;
import java.util.Arrays;

public class ProbabilitySet {
    public static void main(String[] args) {
        Integer[] arr={1,2,3};
        ArrayList<Integer> A=new ArrayList<>(Arrays.asList(arr));
        ArrayList<ArrayList<Integer>> ans=new ArrayList();
        findProbSet(A, 0,new ArrayList<Integer>(),new boolean[A.size()],ans);
        System.out.println(ans);
    }
    private static void findProbSet(ArrayList<Integer> A,int index,ArrayList<Integer> currLst,boolean[] traceArr, ArrayList<ArrayList<Integer>> ans)
    {
        if(A.size()==index)
        {
            ans.add((ArrayList<Integer>) currLst.clone());
            return;
        }
        for(int i=0;i<A.size();i++)
        {
            if(traceArr[i]==false)
            {
                currLst.add(i);
                traceArr[i]=true;
            }
        }                
    }
}
