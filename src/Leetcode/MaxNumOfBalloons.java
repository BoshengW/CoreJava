package Leetcode;
import java.util.*;
public class MaxNumOfBalloons {
    public static int HashMethod(String text) {
        if (text.length()<7) {
            return 0;
        } else {
            String pattern = "balloon";
            HashMap patMap = new HashMap();
            // put pattern in HashMap

            for (int j=0;j<pattern.length();j++) {
                if (patMap.containsKey(pattern.charAt(j))) {
                    int val =  (int) patMap.get(pattern.charAt(j));
                    val++;
                    patMap.put(pattern.charAt(j),val);
                } else {
                    patMap.put(pattern.charAt(j),1);
                }
            }


            HashMap cntMap = new HashMap();
            for (int i=0;i<text.length();i++) {
                if (pattern.indexOf(text.charAt(i))>=0) {
                    // if char in pattern
                    if (cntMap.containsKey(text.charAt(i))) {
                        int val = (int) cntMap.get(text.charAt(i));
                        val++;
                        cntMap.put(text.charAt(i),val);
                    } else {
                        cntMap.put(text.charAt(i),1);
                    }
                }

            }
            // after count the freq, how to count how many pair -> find the minimum
            // how to traverse a HashMap
            int min = -1;
            int temp;

            for(Object word:cntMap.keySet()) {
                temp = (int) cntMap.get(word);
                temp = temp /(int) patMap.get(word);
                if (min==-1 || min>temp) {
                    min = temp;
                }

            }
            return min;
        }

    }



    public static void main(String[] args) {
        String testCase = "nlaebolko";
        System.out.println(MaxNumOfBalloons.HashMethod(testCase));

        System.out.println('a'-'a');
        System.out.println('b'-'a');
        System.out.println('l'-'a');
        System.out.println('o'-'a');
        System.out.println('n'-'a');

        String a = "hello world";
        String[] arr = a.split(" ");
        System.out.println(arr[-1]);
    }
}
