package JavaSE.Collection;

public class ObjectPractic {
    public static void main(String[] args) {
        String s = "Hello World";
        String h = "Hello ";
        String w = "World";
        String m = "World";
        String q = h+w;
        System.out.println(s == q.intern());
    }

}
