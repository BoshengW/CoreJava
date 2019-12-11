package JavaSE;

public class NestClassLearn {
    public int x=0;

    class inner{
        public int x=1;
        public void display(int x) {
            System.out.println("outer class "+NestClassLearn.this.x);
            System.out.println("inner class "+ this.x);
            System.out.println("local var " + x);
        }

    }

    public static void main(String[] args) {
        NestClassLearn ot = new NestClassLearn();
        NestClassLearn.inner in = ot.new inner();
        in.display(10);
    }
}
