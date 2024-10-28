import java.util.ArrayList;
import java.util.*;

public class ComparatorSorting {
    public static void main(String[] args) {
        ArrayList<Integer> A=new ArrayList<>(Arrays.asList(new Integer[]{36,13,13,26,37,28,27,43,7}));
        Collections.sort(A,new SortByNumbersOfFactors());
        OneDimentionalArray.printArray(A);
    }
}
class SortByNumbersOfFactors implements Comparator<Integer> 
{
    @Override
    public int compare(Integer a,Integer b)
    { 
        int res=Integer.compare(numberOfFactors(a),numberOfFactors(b));
        if(res!=0)
            return res;
        return 0;
    }    
    public static Integer numberOfFactors(int n)
    {
        int count=0;
        for(int i=1;i<=Math.sqrt(n);i++)
        {
            if(i*i==n)
                count++;
            else if(n%i==0)
                count+=2;
        }
        return (Integer)count;
    }
}  

