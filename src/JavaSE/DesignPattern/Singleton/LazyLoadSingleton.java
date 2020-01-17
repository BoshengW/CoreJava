package JavaSE.DesignPattern.Singleton;

public class LazyLoadSingleton {
    private static LazyLoadSingleton instance;

    private LazyLoadSingleton() {

    }

    public static synchronized LazyLoadSingleton getInstance() {
        // when lazy load you need consider thread-safe issue.
        if(instance==null) {
            instance = new LazyLoadSingleton();
        }

        return instance;
    }

}
