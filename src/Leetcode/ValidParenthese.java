package Leetcode;
import java.util.*;
public class ValidParenthese {
    public boolean isValid(String s) {
        String left = "([{";
        String right = ")]}";
        Stack storage = new Stack();
        for(int i=0;i<s.length();i++) {
            // if in left save
            if(left.indexOf(s.charAt(i))>=0) {
                System.out.println(s.charAt(i));
                storage.push(s.charAt(i));
                System.out.println(storage);
            } else if (right.indexOf(s.charAt(i))>=0) {
                // if in right check last element in storage
                // check if stack is empty since pop will thorw exception
                if(storage.size()==0) {
                    return false;
                } else {
                    char lastElement = (char) storage.pop();
                    if(left.indexOf(lastElement)!=right.indexOf(s.charAt(i))) {
                        return false;
                    }
                }
                // check right and last element match or not
            }

        }
        return storage.size()==0;

    }

    public static void main(String[] args) {
        String test = "([)]";
        ValidParenthese obj = new ValidParenthese();
        System.out.println(obj.isValid(test));
    }
}
