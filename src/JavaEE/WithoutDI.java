package JavaEE;

public class WithoutDI {
    // design a car classes example without DI
    static class Car {
        private Framework framework;

        Car(int size) {
//            this.framework = new Framework();
            this.framework =new Framework(size);
        }

        public void run() {
            System.out.println("This is Car");
        }
    }

    static class Framework {
        private Bottom bottom;

        Framework(int size) {
//            this.bottom = new Bottom();
            // Still need to change Bottom()
            this.bottom = new Bottom(size);
        }

        public void run() {
            System.out.println("This is Framework");
        }
    }

    static class Bottom {
        private Tyre tyre;

        Bottom(int size) {
//            this.tyre = new Tyre();
            // after change Tyre(), you still need to change Tyre()
            this.tyre = new Tyre(size);
        }

        public void run() {
            System.out.println("This is Bottom");
        }

    }

    static class Tyre {
        private int size;
        // add a args from original Tyre()
        Tyre(int size) {
            this.size = size;
        }
//
//        Tyre() {
//            this.size = 30;
//        }
    }

    public static void main(String[] args) {
//        Car mycar = new WithoutDI.Car();
//        mycar.run();

        // After changing all Class Constructor, you still need to change main function
        int size = 40;
        Car mycar = new WithoutDI.Car(size); // god damn, so heavy

    }
}
