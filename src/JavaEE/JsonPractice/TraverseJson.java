package JavaEE.JsonPractice;

import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;

import java.io.FileReader;
import java.io.IOException;
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
                System.out.println("level"+level+", key: "+ key + ", value:"+json.get((String) key));
            }
        }


    }

    public static void main(String[] args) throws IOException, ParseException {
        JSONParser parser = new JSONParser();
        JSONObject data = (JSONObject) parser.parse(new FileReader("iostream.json"));

        PassJson(data, 0);


    }
}
