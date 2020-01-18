package JavaSE;

// to make your own exception create a class
public class MyException extends Exception {

    public MyException(String s) {
        System.out.println(s);
    }

    public static void methodname(String s) throws MyException {
        System.out.println("exception from inheritance");
        if(s==null) {
            throw new MyException("Opps, error happen");
        } else {
            System.out.println(s);
        }
    }


    public static void main(String[] args) {
        // regular exception
        try {
            int a = 1;
            int b = 0;
            MyException.methodname(null);
            System.out.println(a / b); // this apps stop running in this part
            System.out.println("where am i?");

            // If you don't know which exception you got, just use Exception
            // if catch multiple exception, app only jump in the first exception they found.
            }
        catch (MyException myE) {
            System.out.println("get the Exception you build"); // show system.out in black
            System.err.println("this is BW exception"); // show system.err in red·
            }
        catch (ArithmeticException e) {
                System.out.println("something went wrong");
                System.err.println("something err went wrong");
                e.printStackTrace(); // 在运行过程中会提取最近加入e Stack 的信息
            } // after dealing with exception, apps keeps running (that's why exception can be repaired)
        finally {
                System.out.println("something finally happen");
            }
        System.out.println("end of try catch");

//        // your own exception
//        try {
//            MyException.methodname(null);
//        } catch (Exception e) {
//            System.out.println("get the Exception you build"); // show system.out in black
//            System.err.println("this is BW exception"); // show system.err in red
//        }
    }
}
