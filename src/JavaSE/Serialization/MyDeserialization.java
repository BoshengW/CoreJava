package JavaSE.Serialization;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;

public class MyDeserialization {
    public static void main(String[] args) throws IOException, ClassNotFoundException {

        // this is another create object way -> use serialization
        FileInputStream fis = new FileInputStream("temp.txt");
        ObjectInputStream oin = new ObjectInputStream(fis);

        SerObject user = (SerObject) oin.readObject();
        System.out.println(user.getName());
        System.out.println(user.getAge());

    }
}
