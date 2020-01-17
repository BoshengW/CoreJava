package JavaSE.DesignPattern.Decorator;

public class MyDecorator {

}

interface Car{
    public void assmble();
}

class BasicCar implements Car {
    protected Car car;

    @Override
    public void assmble() {

    }
}
