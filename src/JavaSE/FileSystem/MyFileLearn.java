package JavaSE.FileSystem;

import java.io.File;
import java.io.IOException;
// File classes cannot read content of file
public class MyFileLearn {
    public static void main(String[] args) throws IOException {
        File file = new File("test.txt");
        if(file.exists()) {
            file.delete();
        } else {
            System.out.println("file not found");
        }
        // File class similar like chmod in linux
    }

}
