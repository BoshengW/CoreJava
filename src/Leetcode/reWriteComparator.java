package Leetcode;

import java.util.*;

import java.util.ArrayList;

public class reWriteComparator {

    public static String[] reorderLogFiles(String[] logs) {
        ArrayList<String> letter = new ArrayList<String>();
        ArrayList<String> digit = new ArrayList<String>();
        for(int i=0;i<logs.length;i++) {
            String temp = logs[i].substring(0,3); //
            if(temp.equals("let")) {
                letter.add(logs[i]);
            } else if(temp.equals("dig")) {
                digit.add(logs[i]);
            }
        }
        // overwrite sort function based on letter
        Collections.sort(letter, new Comparator<String>() {
            @Override
            public int compare(String log1, String log2) {
                String[] split1 = log1.split(" ",2); // extract second word
                String[] split2 = log2.split(" ",2);

                // compare first letter by String.compareTo -> return value between their ASCII code
                return split1[1].substring(0,1).compareTo(split2[1].substring(0,1));

            }
        });
        letter.addAll(digit);
        System.out.println(letter);
        // toArray cannot convert from Object[] to String[]/Integer[]...
        String[] result = new String[letter.size()];
        letter.toArray(result);
        return result;
    }

    public static void main(String[] args) {
        String[] logs = {"let1 art can","dig1 3 4 5","let2 own kit dig","let3 art zero"};
        String[] logResult = new String[logs.length];
        logResult = reWriteComparator.reorderLogFiles(logs);
        System.out.println(Arrays.toString(logResult));
        HashMap cntmap = new HashMap();
        cntmap.put("text",1);
        cntmap.get("text");


    }

}
