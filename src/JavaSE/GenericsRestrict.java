package JavaSE;
import java.util.*;

// For generics you can use <extends class> to restrict usage
public class GenericsRestrict<T extends List> {
    private T fooArray;

    public GenericsRestrict(T fooArray) {
        this.fooArray = fooArray;

    }
    public T getArray() {
        return fooArray;
    }

    public static void main(String[] args) {
        LinkedList[] templlists = {new LinkedList(),new LinkedList()};
        LinkedList templlist = new LinkedList();
        ArrayList tempalist = new ArrayList();
        tempalist.add(1);
        tempalist.add(2);

        templlist.add(3);
        templlist.add(4);

        GenericsRestrict<ArrayList> arlist = new GenericsRestrict<ArrayList>(tempalist);
        GenericsRestrict<LinkedList> llist = new GenericsRestrict<LinkedList>(templlist);

        System.out.println(arlist.getArray());
        System.out.println(llist.getArray());

    }


}
