package JavaSE.Collection;
import java.util.HashSet;
import java.util.TreeSet;
public class MyTreeSet {

    public static void main(String[] args) {
        TreeSet tset = new TreeSet();
        HashSet hset = new HashSet();
        HashSet hset2 = new HashSet();

        hset.add(1);
        hset.add(2);

        hset2.add(3);
        hset2.add(4);
        // addAll can add any data structure from Collection
        tset.addAll(hset);
        tset.addAll(hset2);

        System.out.println(tset);

    }
}
