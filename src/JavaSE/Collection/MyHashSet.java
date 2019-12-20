package JavaSE.Collection;
import java.util.AbstractSet;
import java.util.HashMap;
import java.util.Hashtable;
import java.util.Iterator;

public class MyHashSet implements MySet {
    private Hashtable <Object, Object> table;
    private static final Object temp = new Object();

    public MyHashSet() {
        table = new Hashtable<>();
    }



    @Override
    public void add(Object element) {
        table.put(element,temp); // HashTable cannot save null
        // in set we don't need value, we only need key.
    }

    public Iterator iterator() {
        return table.keySet().iterator();
    }

    @Override
    public boolean remove(Object element) {
        return false;
    }

    @Override
    public boolean contains(Object element) {
        return false;
    }

    @Override
    public int size() {
        return 0;
    }

    public void print() {
        for(Object element:table.keySet()) {
            System.out.println(element);
        }
    }

    // Set interface give us all abstract method you need to implement for set.
    // this part we implement a new data structure Hashset based on HashTable
    /*
    Actually speaking, Hash Table & Hash map is similar but HashTable is thread-safe and not allow null key&value.
    Considering about safty, we implement set based on HashTable data structure.
    * */

    public static void main(String[] args) {
        MyHashSet myset = new MyHashSet();
        myset.add(1);
        myset.add("s");
        myset.print();
        // how to inherit element
        // ex. you can access array by array[1]
        // if you create new data structure how to do the same thing.
    }
}
