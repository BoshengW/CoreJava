package JavaSE.DesignPattern.Singleton;

public class Singleton {
    // inner class singleton
    private static class InnerSingleton {
        private static final Singleton instance = new Singleton();
    }

    private Singleton() {
    }
    // thread-safe
    public static Singleton getInstance() {
        return InnerSingleton.instance;
    }

}
