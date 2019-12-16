package Leetcode;
import java.util.HashMap;

public class Count {
    public static void main(String[] args) {
        String[] input = {"a","a","b","c","b","a"};
//        HashMap<String,Integer> hmap = new HashMap<String, Integer>();
        HashMap hmap = new HashMap();
        for (int i=0; i<input.length; i++) {
            if(hmap.containsKey(input[i])){
                int temp = (int) hmap.get(input[i]);
                temp++;
                hmap.put(input[i],temp);

            } else {
                hmap.put(input[i],1);
            }
        }

        // how to traversal hashmap
        // Map.Entry

        System.out.println(hmap);
    }
}
