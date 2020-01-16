package JavaSE.DesignPattern.Singleton;

public class LazyLoadSingleton {
    private static LazyLoadSingleton instance;

    private LazyLoadSingleton() {

    }

    public static synchronized LazyLoadSingleton getInstance() {
        if(instance==null) {
            instance = new LazyLoadSingleton();
        }

        return instance;
    }

}
