package JavaSE;

public class NestClass {
    int count;
    // member class
    public void dispMemberClass() {
        inner1 in1 = new inner1();
        in1.show();

    }
    class inner1 {
        public void show() {
            System.out.println("Inner class Member Class");
        }
    }

    // local inner class
    public void dispLocalInnerClass() {
        for(int i=0;i<5;i++) {
            // Inner class defined inside for loop
            class inner{
                public void show(){
                    System.out.println("Inside inner"+(count++));
                }
            }
            inner in = new inner();
            in.show();

        }

    }

    // Inner class instantiated outside Outer class
    /*
    Outer ot = new Outer();
    Outer.Inner in = ot.new Inner();
    in.show()
    */


    public static void main(String[] args) {
        NestClass nest = new NestClass();
        nest.dispLocalInnerClass();
        // Annoymous class
        Animal an = new Animal() {
            public void type(){
                System.out.println("Anonymous class");
            }

            public void show() {
                System.out.println("instanlizing interface methods");
            }
        };
        an.type();

        // if you just want to implement a single method rather than a whole interface

    }
}


// example code
interface Animal{
    void type();
    void show();
}

