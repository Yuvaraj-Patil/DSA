package IntermediateDSA2;

import java.util.ArrayList;
import java.util.Collections;

public class AddOne {
    public static void main(String[] args) {
        ArrayList<Integer> A=new ArrayList<Integer>();
        A.add(0);
        A.add(6);
        A.add(0);
        A.add(6);
        A.add(4);
        A.add(8);
        A.add(8);
        A.add(1);
        ArrayList<Integer> ans=new ArrayList();
        int n=A.size(),carry=1;
        for(int i=n-1;i>=0;i--)
        {
            int d=A.get(i);
            ans.add((d+carry)%10);            
            carry=(d+carry)/10;
        }
        if(carry!=0)
            ans.add(carry);
        Collections.reverse(ans);
        for(int i=0;i<ans.size();i++)
        {
            if(ans.get(i)!=0)
                break;
            else
                ans.remove(i);
        }
        System.out.println(ans);
    }
}
