package ch17;

import com.google.gson.Gson;
import com.google.gson.JsonArray;
import com.google.gson.JsonObject;
import com.google.gson.reflect.TypeToken;
import org.junit.Test;

import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.Reader;
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.List;

public class JSONDemo3 {
//    将json数组转换成对象集合，或者java对象集合转换成json
    @Test
    public void gson2(){
        Gson gson = new Gson();
        InputStream in = Thread.currentThread().getContextClassLoader()
                .getResourceAsStream("ch17/json/names.json");
        Reader reader = new InputStreamReader(in);
//        匿名类
        TypeToken<List<Name>>  typeToken=new TypeToken<List<Name>>(){};
        List<Name> list=gson.fromJson(reader,typeToken.getType());
        System.out.println(list);
        System.out.println("------------------------------------");
//       同样的逆向转过来，将集合list转换成json
       String jsons= gson.toJson(list,typeToken.getType());
        System.out.println(jsons);

    }

    //    json 文件转换成对象 简单的不存在跳过之类的要求的，可以用
    @Test
    public void gson1() {

        Gson gson = new Gson();
        InputStream in = Thread.currentThread().getContextClassLoader()
                .getResourceAsStream("ch17/json/name.json");
        Reader reader = new InputStreamReader(in);
        Name name = gson.fromJson(reader, Name.class);
        System.out.println(name);
//转换成json
        String json=gson.toJson(name);
        System.out.println(json);
    }
    @Test
    public void createJSON() {
        List<Name> list = new ArrayList<>();
        list.add(new Name("ming", "zhang", "zhangm@sohu.com"));
        list.add(new Name("fei", "li", "lif@niit.edu.cn"));
        list.add(new Name("hong", "li", "lih@niit.edu.cn"));
        JsonArray jsonArray = new JsonArray();
        for (Name n : list) {
            JsonObject jsonObject = new JsonObject();
            jsonObject.addProperty("firstname", n.getFirstname());
            jsonObject.addProperty("lastname", n.getLastname());
            jsonObject.addProperty("email", n.getEmail());
            jsonArray.add(jsonObject);
        }

        System.out.println(jsonArray.toString());


    }
}
