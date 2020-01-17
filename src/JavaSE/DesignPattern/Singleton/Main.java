package JavaSE.DesignPattern.Singleton;

public class Main {
    public static void main(String[] args) {
        MySingleton instance = MySingleton.INSTANCE;

        System.out.println(instance.getValue());
        instance.setValue(2);
        System.out.println(instance.getValue());

        System.out.println(instance);

    }
}
