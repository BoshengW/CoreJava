package JavaSE;
import javax.swing.text.html.HTMLDocument;
import java.util.*;

public class ArrayLearn {
    public static void main(String[] args) {

        int[] list = new int[10];
        for (int i=0;i<list.length;i++){
            list[i] = i;
        }

        // easier way to traversal list
        for (int val:list) {
            System.out.println(val);
        }
        // print list -> need to import java.util.Arrays
        // Arrays.toString(list)
        System.out.println(Arrays.toString(list));

        // In array object, there is not a lot method
        // But after importing java.util.Arrays, there is a lot method for Array

        String[] list2 = {"x","z","y"};
        // convert to List -> ArrayList don't allow primitive data type.
        List arraylist = Arrays.asList(list2);
        System.out.println(arraylist);

        // check if array contains a certain value
        System.out.println(arraylist.contains("x"));
        // size of list
        System.out.println(arraylist.size());
        // isEmpty() to check if list is empty or not
        System.out.println(arraylist.isEmpty());

        // Use List in Java
        // append the specified element to the end of this list
        List mylist = new ArrayList();
        mylist.add("y");

        mylist.add("x");
        mylist.add("x");
        mylist.add(3,"a"); // add element in specific index
        // pop off the element
        mylist.remove(0);
        System.out.println(mylist);

        // sublist
        List mysublist = mylist.subList(1,3);
        System.out.println(mysublist);

        // get val based on idx
        System.out.println(mylist.get(0));

        // Iterator
        Iterator<String> iterator = mylist.iterator();
        while(iterator.hasNext()) {
            String next = iterator.next();
            System.out.println(next);
        }

        // convert list to Set
        Set set = new HashSet();
        set.addAll(mysublist);
        System.out.println(set);

        // find element in a list (find first element index)
        int idx = mylist.indexOf("x");
        System.out.println(idx);

        int lastidx = mylist.lastIndexOf("x");
        System.out.println(lastidx);

        // remove all element in list
        mylist.clear();
        System.out.println(mylist);

        // multi-dimonsional array
        int[][] twoDArray = new int[10][10];






    }
}
