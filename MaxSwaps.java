package IntermediateDSA2;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;

public class MaxSwaps {
    public static void main(String[] args) {
        Integer[] arr={52,7,93,47,68,26,51,44,5,41,88,19,78,38,17,13,24,74,92,5,84,27,48,49,37,59,3,56,79,26,55,60,16,83,63,40,55,9,96,29,7,22,27,74,78,38,11,65,29,52,36,21,94,46,52,47,87,33,87,70};
        ArrayList<Integer> A=new ArrayList<>(Arrays.asList(arr));
        System.out.println(solve(A,19));
    }
    public static int solve(ArrayList<Integer> A, int B) {
        int count=0,ans=Integer.MAX_VALUE,n=A.size();
        for(int a : A)
        {
            if(a<=B)
                count++;
        }        
        if(count<=1)
            return 0;
        else
        {
            int l=0,r=0,swap=0;
            while(r<count)
            {
               if(A.get(r)>B)
                swap++;
                r++;
            }
            ans=swap;
            while(r<n)
            {
                if(A.get(r)>B)
                    swap++;
                if(A.get(l)>B)
                    swap--;
                ans=Math.min(ans,swap);
                l++;r++;
            }     
            return ans;      
        }
    }
}
