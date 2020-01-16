package JavaEE;

public class DependencyInversion {
    // let's create an group of objects with normal design
    /*
    design a car
    ->tyre -> bottom -> framework -> car
    * */
    // different with Car Class in WithoutDI, we put tyre class as Dynamic input.
    static class Car {
        private Framework framework;

        Car(Framework framework) {
            this.framework = framework;
        }
    }

    static class Framework {
        private Tyre tyre;
        Framework(Tyre tyre) {
            this.tyre = tyre;
        }
    }

    static class Tyre {
        private int size;
        Tyre(int size) {
            this.size=size;
        }
    }

    public static void main(String[] args) {
        // if you want to change anything in class, since input is dynamic, so you
        //  don't need to change whole structure, only thing you need to change is single class itself.
        // In DI, Create a new object might need a lot initialization
        // the follow code can be considered as a IoC Container.
        int size = 40;
        Tyre mytyre = new DependencyInversion.Tyre(size);
        Framework myframe = new DependencyInversion.Framework(mytyre);
        Car mycar = new DependencyInversion.Car(myframe);

    }

}
