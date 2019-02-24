package cn.edu.niit.codingke.ch8;

import java.io.*;
import java.util.Properties;

/**
 * 如果希望配置文件可读可写 则使用工具类Properties
 * 如果只想都
 * 就一个用ResourceBundle类就可以了，ResourceBundle用的是时候，去配置文件的前缀名字就可以了
 *
 */

public class PropertiesDemo {
    private  static  String  version="";
    private  static  String  username="";
    private  static  String   password="";
    //静态语句块，只执行一次
    static {
        readConfig();
        writeConfig("1.00","梁实秋","kk2313");

    }


    private  static void writeConfig(String version,String username,String password){
          Properties p=new Properties();
          p.put("app.version",version);
          p.put("db.username",username);
          p.put("db.password",password);
        try {
            OutputStream out=new FileOutputStream("c:\\test\\my.properties");
            p.store(out,"存入my.properties");
            out.flush();
            out.close();

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
//



    }

public static void readConfig(){
    Properties p=new Properties();
//    File file=new File(this.getClass().getResourceAsStream());
    try {
        InputStream in=Thread.currentThread().getContextClassLoader()
                .getResourceAsStream("cn/edu/niit/codingke/codingke/res/config.properties");
        p.load(in);
        version=p.getProperty("app.version");
        username=p.getProperty("db.username");
        password=p.getProperty("db.password");
        System.out.println("输出标准配置信息："+version+"用户名："+username+"密码："+password);

    } catch (FileNotFoundException e) {
        e.printStackTrace();
    } catch (IOException e) {

        e.printStackTrace();
    }
}

    public  static  void main(String[] args){
//        readConfig();
}
}