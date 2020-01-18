package JavaSE.Serialization;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class MySerialization {

    public static void main(String[] args) throws IOException, FileNotFoundException {
        FileOutputStream fos = new FileOutputStream("temp.txt");
        ObjectOutputStream oos = new ObjectOutputStream(fos);

        SerObject user = new SerObject();
        user.setAge(10);
        user.setName("Bosheng");
        user.setSex("Male");

        oos.writeObject(user);
        oos.flush();
        oos.close();

    }
}
