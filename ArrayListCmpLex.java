import java.util.ArrayList;
import java.util.Comparator;

public class ArrayListCmpLex implements Comparator<ArrayList<Integer>> {
    @Override
    public int compare(ArrayList<Integer> list1, ArrayList<Integer> list2) { 
        int minLen=Math.min(list1.size(),list2.size());             
        // If the sizes are equal, compare the elements lexicographically
        for (int i = 0; i < minLen; i++) {
            int elementCompare = Integer.compare(list1.get(i), list2.get(i));
            if (elementCompare != 0) {
                return elementCompare;
            }
        }
        return Integer.compare(list1.size(), list2.size());
    }
}
