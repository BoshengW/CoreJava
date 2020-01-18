package JavaEE.JsonPractice;

import com.google.gson.stream.JsonWriter;

import java.io.FileWriter;
import java.io.IOException;

public class JsonGenerate {


    public static void main(String[] args) throws IOException {
        try(JsonWriter writer = new JsonWriter(new FileWriter("./iostream.json"))) {
            writer.beginObject();

            writer.name("name").value("mkyong");    // "name" : "mkyong"
            writer.name("age").value(29);           // "age" : 29

            writer.name("child1");
            writer.beginObject();
            writer.name("name").value("bosheng");
            writer.name("age").value(30);
            writer.endObject();
            writer.name("child2");
            writer.beginObject();
            writer.name("name").value("chen");
            writer.name("value").value(24);
            writer.name("childchild2");
            writer.beginObject();
            writer.name("message");
            writer.beginArray();
//            writer.name("childinArray");
//            writer.beginObject();
//            writer.name("user").value("xin");
//            writer.name("newuser").value("Lin");
//            writer.endObject();
            writer.value(1);
            writer.value(2);
            writer.value(3);
            writer.endArray();
            writer.endObject();
            writer.endObject();

            writer.endObject();

        } catch(IOException e) {
            e.printStackTrace();
        }
    }
}
