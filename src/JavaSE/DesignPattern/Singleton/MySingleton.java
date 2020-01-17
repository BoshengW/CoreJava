package JavaSE.DesignPattern.Singleton;


// how to create a singleton object in enum class
// most safe way for generating singleton, without serialization & reflection issue
public enum MySingleton {
    // this is call enum field are compile time constants (调用这个常量即可创建object 参考Main.java)
    INSTANCE; //<==> public static final MySingleton INSTANCE = new MySingleton(); // eager-loading

    // 定义一些Singleton class里面的fields
    int value;

    // 构造器 默认为空
    // enum will create a empty constructor in default
    private MySingleton() {
        System.out.println("In Enum");
    }

    // getter & setter
    public void setValue(int value) {
        this.value = value;
    }

    public int getValue() {
        return this.value;
    }

}
