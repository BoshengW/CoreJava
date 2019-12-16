package JavaSE;
import java.util.*;

public class Generics<T> {
    // T可以写成任何标识， 常见的如T，E，K等形式的参数常用于表示泛型
    // 实例化的时候，必须指定T的类型
    private T key;
    public Generics(T key) {
        this.key = key;
    }
    public T getKey() {
        return key;
    }

    public static void main(String[] args){
        //why we use generics? so time
        //think about sometime you wanna make a method which suitible
        // for more than one type (String + int ) then you can create a generics method
        // you can specify generics in creating new object
        Generics<String> geneObj = new Generics<String>("this is Generics");
        System.out.println(geneObj.getKey());
        // also new object will change datatype automatically
        Generics geneobj2 = new Generics(111);
        System.out.println(geneobj2.getKey());
    }
}
