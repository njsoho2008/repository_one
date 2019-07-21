package ch17;

import com.google.gson.stream.JsonReader;
import org.junit.Test;

import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.Reader;
import java.util.ArrayList;
import java.util.Arrays;

public class JSONDemo {

    //解析数组
    @Test
    public void paraseJSONames() {

        InputStream in = Thread.currentThread().getContextClassLoader()
                .getResourceAsStream("ch17/json/names.json");
        System.out.println(in.toString());
        Reader reader = new InputStreamReader(in);
//    Json解析器
        JsonReader JReader = new JsonReader(reader);
        ArrayList<Name> list = new ArrayList<>();
        try {
//            开始解析数组
            JReader.beginArray();
            while (JReader.hasNext()) {
                list.add(paraseName(JReader));
            }
//            结束解析数组
            JReader.endArray();
        } catch (IOException e) {
            e.printStackTrace();
        }
      System.out.println(Arrays.toString(list.toArray()));

//        System.out.println(list.toArray().toString());

        for(Name n:list){
            System.out.println(n.toString());
        }
    }

    //    解析对象Name
    private Name paraseName(JsonReader jsonReader) {
        Name name = new Name();
        try {
            jsonReader.beginObject();
            while (jsonReader.hasNext()) {
                String attriname = jsonReader.nextName();
                if ("firstname".equals(attriname)) {
                    name.setFirstname(jsonReader.nextString());
                } else if ("lastname".equals(attriname)) {
                    name.setLastname(jsonReader.nextString());
                } else if ("email".equals(attriname)) {
                    name.setEmail(jsonReader.nextString());
                }
            }
            jsonReader.endObject();

        } catch (IOException e) {
            e.printStackTrace();
        }
        return name;
    }
}
