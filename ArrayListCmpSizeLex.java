package IntermediateDSA2;

import java.util.ArrayList;
import java.util.Comparator;

public class ArrayListCmpSizeLex implements Comparator<ArrayList<Integer>>{
    @Override
    public int compare(ArrayList<Integer> list1, ArrayList<Integer> list2) { 
        // Compare the size first
        int sizeCompare = Integer.compare(list1.size(), list2.size());
        if (sizeCompare != 0) {
            return sizeCompare;
        }
        // If the sizes are equal, compare the elements lexicographically
        for (int i = 0; i < list1.size(); i++) {
            int elementCompare = Integer.compare(list1.get(i), list2.get(i));
            if (elementCompare != 0) {
                return elementCompare;
            }
        }
        return 0;
    }    
}
