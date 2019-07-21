package ch17;

import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonToken;
import org.junit.Test;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class JSONDemo2 {
    @Test
    public void paraseJSONMessage() {
        InputStream in = Thread.currentThread().getContextClassLoader().getResourceAsStream("ch17/json/message.json");
      /*  try {
            InputStream in2=new FileInputStream("ch17/json/message.json");
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }*/

        JsonReader jsonReader = new JsonReader(new InputStreamReader(in));

        ArrayList<Message> list = readMessageArray(jsonReader);

        for (Message m : list) {
            System.out.println(m.toString());
        }

    }

    //    读取message数组
    private ArrayList<Message> readMessageArray(JsonReader jsonReader) {

        ArrayList<Message> list = new ArrayList<>();

        try {
            jsonReader.beginArray();
            while (jsonReader.hasNext()) {


                list.add(getMessage(jsonReader));

            }
            jsonReader.endArray();
        } catch (IOException e) {
            e.printStackTrace();
        }

        return list;

    }

    //读取message对象
    private Message getMessage(JsonReader jsonReader) {
        Message message = null;
        long id = -1;
        String text = null;
        User user = null;
        ArrayList<Double> geo = null;

        try {
            jsonReader.beginObject();
            while (jsonReader.hasNext()) {
                String attrname = jsonReader.nextName();

                if ("id".equals(attrname)) {
//                    message.setId(Long.parseLong("id"));
                    id = jsonReader.nextLong();


                } else if ("text".equals(attrname)) {
                    text = jsonReader.nextString();

                } else if (attrname.equals("geo") && jsonReader.peek() != JsonToken.NULL) {
                    geo = readDoublesArray(jsonReader);
                } else if (attrname.equals("user")) {
                    user = readUser(jsonReader);
                }else {
                    jsonReader.skipValue();
                }
            }
            jsonReader.endObject();
        } catch (IOException e) {
            e.printStackTrace();
        }
        message = new Message(id, text, geo, user);
        return message;


    }

    private User readUser(JsonReader jsonReader) {
        User user = null;
        String username = null;
        int followerCount = 0;
        try {
            jsonReader.beginObject();
            while (jsonReader.hasNext()) {
                String aname = jsonReader.nextName();
                if(aname.equals("name")){
                    username=jsonReader.nextString();

                }else if(aname.equals("followers_count")){
                    followerCount=jsonReader.nextInt();

                }else {
                    jsonReader.skipValue();

                }

            }
            jsonReader.endObject();
        } catch (IOException e) {
            e.printStackTrace();
        }

        return  new User(username,followerCount);
    }

    private ArrayList<Double> readDoublesArray(JsonReader jsonReader) {
        ArrayList<Double> list = new ArrayList<>();
        try {
            jsonReader.beginArray();
            while (jsonReader.hasNext()) {
                list.add(jsonReader.nextDouble());
            }
            jsonReader.endArray();
        } catch (IOException e) {
            e.printStackTrace();
        }


        return list;

    }


}
