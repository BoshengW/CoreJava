package JavaSE.DesignPattern.Singleton;

public class Main {
    public static void main(String[] args) {
        MySingleton instance = MySingleton.INSTANCE;
        System.out.println(instance);
    }
}
