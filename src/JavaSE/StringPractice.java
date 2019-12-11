package JavaSE;

public class StringPractice {
    public static void main(String[] args) {
        //
        String str = "Bosheng"; // immutable variable
        // get element of String in this index
        System.out.println(str.charAt(2));

        // concat string
        System.out.println(str.concat(" author"));

        // or use "+"/ "+="
        System.out.println(str + "author");

        // two string equal without case
        System.out.println(str.equalsIgnoreCase(str));

        // length of String
        System.out.println(str.length());

        // replace
        System.out.println(str.replace('B','b'));

        // get substring (begin, end)
        System.out.println(str.substring(3));

        // lowercase & uppercase
        System.out.println(str.toLowerCase());
        System.out.println(str.toUpperCase());
        System.out.println(str);

        // remove leading & trailing blank space removed
        String str1 = " Bosheng ";
        System.out.println(str1);
        System.out.println(str1.trim() + "X");

        // public put into array
        char[] arrayChar = str1.toCharArray();
        System.out.println(arrayChar[1]);

        // check if String has target
        // case sensitive
        System.out.println(str1.contains("bosheng"));

    }
}
