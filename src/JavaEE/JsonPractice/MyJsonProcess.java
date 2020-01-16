package JavaEE.JsonPractice;

import org.json.*;

import java.util.HashMap;

//  this program is practice for how to access a json object
/*
1. What is Json?
-> JavaScript Object Notation (JSON) is most commonly used for client-server communication
-> A json value can be: JSON object, array, number, string, boolean(true/false) or null

* */
public class MyJsonProcess {
    public static void main(String[] args) {
        // java json library
        JSONObject myJson = new JSONObject();
        myJson.put("message", "Hello World"); // add value in json object
        System.out.println(myJson);

        // how to express a json in string
        String jsonStr = "{ \"message\": \"Hello world\", \"name\": \"Bosheng\" }";
        System.out.println(jsonStr);

        // create json from map
        HashMap<String,String> map = new HashMap<>();
        map.put("message","model");
        map.put("name", "Bosheng");
        JSONObject jo = new JSONObject(map);
        System.out.println(jo);

        // creating JSONobject from JSON string
        String JsonString = "{ \"message\": \"Hello world\", \"name\": \"Bosheng\" }";
        JSONObject jo2 = new JSONObject(JsonString);
        System.out.println(jo2);


        // Serialize Java Object to JSON
        // convert Java object to json, you have to use a class that is a valid java bean
        JsonBean demo = new JsonBean();
        demo.setId(1);
        demo.setName("Star");
        demo.setPassword("123");
        JSONObject jo3 = new JSONObject(demo);
        System.out.println(jo3);
    }
}
