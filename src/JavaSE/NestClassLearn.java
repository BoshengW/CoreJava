package JavaSE;

public class NestClassLearn {
    public int x=0;

    static class staticInner{
        public int x=1;
        public void display(int x) {
            System.out.println("outer class " + x);
            System.out.println("inner class "+ this.x);
            System.out.println("local var " + x);
        }

    }

    // non static inner class -> member class
    class noStaticInner{
        public int x=2;
        public void display(int x) {
            System.out.println("outer class " + NestClassLearn.this.x);
            System.out.println("inner class " + this.x);
            System.out.println("local var " + x);
        }
    }

    public static void display() {
        final int x = 10;
        class InnerClass {
            public void printOfInner() {
                System.out.println("inner class in a method " + x);
            }
        }
        // use this Inner class
        new InnerClass().printOfInner();
    }

    public static void main(String[] args) {
        // refer inner static class
        NestClassLearn.staticInner obj1 = new staticInner();
        obj1.display(2);
        // refer inner non-static class
        noStaticInner obj2 = new NestClassLearn().new noStaticInner();
        obj2.display(3);
        // or
        NestClassLearn ot = new NestClassLearn();
        NestClassLearn.noStaticInner in = ot.new noStaticInner();
        in.display(10);

        // use method with a inner class inside
        NestClassLearn.display();

    }
}
