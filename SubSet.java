package IntermediateDSA2;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class SubSet {
    public static void main(String[] args) {
        Integer[] arr={9,-20,-11,-8,-4,2,-12,14,1,-18};
        ArrayList<Integer> A=new ArrayList<>(Arrays.asList(arr));
        ArrayList<ArrayList<Integer>> ans=new ArrayList();
        Collections.sort(A);
        findSubSets(A,0,new ArrayList<Integer>(),ans);        
        Collections.sort(ans,new ArrayListCmpLex());
        System.out.println(ans);
    }
    private static void findSubSets(ArrayList<Integer> A,int index,ArrayList<Integer> currSet,ArrayList<ArrayList<Integer>> ans)
    {
        if(index== A.size())
        {
            ArrayList<Integer> subSet=(ArrayList<Integer>)currSet.clone();
            ans.add(subSet);
            return;
        }
        findSubSets(A,index+1,currSet,ans);
        currSet.add(A.get(index));
        findSubSets(A,index+1,currSet,ans);
        currSet.remove(currSet.size()-1);
    }
}
