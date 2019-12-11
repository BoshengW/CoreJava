package JavaSE;

public class strBuilder {

    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder();
//        StringBuffer sb = new StringBuffer();
        // append
        sb.append("abc");
        sb.append(2);
        System.out.println(sb);

        //delete (begin, end)
        sb.delete(4, 8);
        System.out.println(sb);
        //insert (idx offset, String s)
        sb.insert(1, "xyz");
        System.out.println(sb);
        //replace (int start, int end, String)
        sb.replace(1,3,"XYZ");
        System.out.println(sb);

        // reverse
        System.out.println(sb.reverse());

        //set a single char in str by idx
        sb.setCharAt(2,'B');
        System.out.println(sb);

        //
    }
}
