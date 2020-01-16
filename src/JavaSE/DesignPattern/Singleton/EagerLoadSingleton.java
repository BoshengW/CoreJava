package JavaSE.DesignPattern.Singleton;

/*
 * Singleton -> no matter how many instance you create, all instance share one memory address
 * Two way to implement singleton ：
 *       1. eager loading -> 建立new object就会loading -> suit for when call is frequent
 *       2  lazy loading -> 只有在你想调用的时候才调用 -> suit for when cost of creation is high
 *
 * To design a singleton class:
 *   1. Make constructor as private
 *   2. Write static method that has return type object of this singleton class.
 */

public class EagerLoadSingleton {
    private static EagerLoadSingleton instance = new EagerLoadSingleton();

    private EagerLoadSingleton() {
    }

    public static EagerLoadSingleton getInstance() {
        return instance;
    }

}
