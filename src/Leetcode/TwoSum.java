package Leetcode;
import java.util.*;

public class TwoSum {
    // its a good way use hashmap/hashtable
    public int getIndex(int[] array, int target) {
        int targetIdx=0;
        //declare Hashmap as generics
        HashMap<Integer,Integer> hmap = new HashMap<Integer, Integer>();
        for (int i=0; i<array.length; i++) {
            hmap.put(array[i],i);
        }
        //Two way to traversal hashmap
          //1. While()
//        Iterator hmapIterator = hmap.entrySet().iterator();
//        while (hmapIterator.hasNext()) {
//            Map.Entry mapElement = (Map.Entry)hmapIterator.next();
//            int index = (int) mapElement.getValue();
//            int value = (int) mapElement.getKey();
//            System.out.println("While Lopp-> Index "+index + ", Value " +value );
//
//        }
          //2.for-loop()
        for (Map.Entry mapElement : hmap.entrySet()) {
            int index = (int) mapElement.getValue();
            int value = (int) mapElement.getKey();
            System.out.println("For Lopp-> Index "+index + ", Value " +value );
        }
        return targetIdx;
    }

    public static void main(String[] args) {
        int[] array = {1,4,2,3,2};
        int index;
        TwoSum tsObj = new TwoSum();
        index = tsObj.getIndex(array,5);



    }
}
