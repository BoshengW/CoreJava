package JavaSE.FileSystem;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class MySerialization {

    public static void main(String[] args) throws IOException {
        String p1 = "Person";
        String p2 = "Person2";
        String p3 = "Person3";

        //file suffix doesn't matter
        FileOutputStream fos = new FileOutputStream("test.txt");

        ObjectOutputStream oos = new ObjectOutputStream(fos);
        oos.writeObject(p1);
        oos.writeObject(p2);
        oos.writeObject(p3);
        oos.close();
    }
}
