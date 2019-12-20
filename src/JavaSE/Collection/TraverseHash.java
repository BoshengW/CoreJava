package JavaSE.Collection;
import java.util.*;
import java.lang.*;
public class TraverseHash {
    public static void main(String[] args) {
        HashMap map = new HashMap();
        Hashtable table = new Hashtable();
        HashSet set = new HashSet();

        map.put("Star",25);
        map.put("Cecilia",25);
        map.put("Ben",24);

        table.put("A",100);
        table.put("B",80);

        set.add(1);
        set.add("s");

        // how to traverse these f**king hash s**t
        // ----> Hashset, different with array type, set cannot access by set[i]
        // 1. for loop
        for (Object element:set) {
            System.out.println(element);
        }

        // 2. Iterator
        Iterator iter = set.iterator();
        while(iter.hasNext()) {
            Object element = iter.next();
            System.out.println(element);
        }
        // 3. you can convert arrayList (a little stupid)
        // then you can access by index
        ArrayList array = new ArrayList(set);
        for (int i=0;i<array.size();i++) {
            System.out.println(array.get(i));
        }

        // -----> HashMap/table
        // 1. built in function forEach - lambda expression
        map.forEach((key,value) -> System.out.println("key: "+key+" Value: "+value));

        table.forEach((key,value) -> System.out.println("key: "+key+" Value: "+value));

        // 2. Iterating over key
        for (Object name: map.keySet()) {
            Object temp = map.get(name);
            if ((int) temp>10) {
                temp = (int) temp*10;
            }
            System.out.println("Key: "+ name + " Value" + temp);
        }

        // Use Iterators
        Iterator<Map.Entry<String, Integer>> itr = map.entrySet().iterator();

        while(itr.hasNext()) {
            Map.Entry<String, Integer> entry = itr.next();
            if (entry.getValue()>10) {
                entry.setValue(entry.getValue()*10);
            }
            System.out.println("Key "+ entry.getKey() + " Value "+ entry.getValue());
        }
    }
}
