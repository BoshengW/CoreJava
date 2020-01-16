package JavaSE.DesignPattern.Singleton;

public enum MySingleton {
    INSTANCE;

    private MySingleton() {
        System.out.println("In Enum");
    }

}
