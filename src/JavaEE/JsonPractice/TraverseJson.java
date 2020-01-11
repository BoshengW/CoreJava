package JavaEE.JsonPractice;

import org.json.JSONObject;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class TraverseJson {

    public static void PassJson(JSONObject json, int level) {
        Object[] keySet = json.keySet().toArray();
        for(Object key: keySet) {
            if(json.get((String) key) instanceof JSONObject) {
                System.out.println("level"+level+", key: "+ key);
                PassJson((JSONObject) json.get((String) key), level+1);
            } else {
                System.out.println("level"+level+", key: "+ key);
            }
        }


    }

    public static void main(String[] args) {
        JSONObject json1 = new JSONObject();
        JSONObject json2 = new JSONObject();
        JSONObject json3 = new JSONObject();
        JSONObject json4 = new JSONObject();
        JSONObject json5 = new JSONObject();
        JSONObject json6 = new JSONObject();
        JSONObject json7 = new JSONObject();
        JSONObject json8 = new JSONObject();

        //
        json1.put("key1",json2);
        json1.put("key2",json3);
        //
        json2.put("key3",json4);
        json2.put("key4",json6);
        json4.put("key5",json5);
        json3.put("key6",json7);
        json7.put("key7",json8);

        PassJson(json1,1);
        System.out.println(json1.toString());

    }
}
