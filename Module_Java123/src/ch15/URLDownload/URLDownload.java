package ch15.URLDownload;

import java.io.*;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;

public class URLDownload {

    public static void main(String[] args) {
        try {
            URL url=new URL("https://www.apache.org/img/support-apache.jpg");
          HttpURLConnection conn= (HttpURLConnection) url.openConnection();

            InputStream in=new BufferedInputStream(conn.getInputStream());
            OutputStream out=new BufferedOutputStream(new FileOutputStream("G:\\mina.jpg"));
//定义一个缓存区bytes，以便从输入流读取数据存放到bytes缓存区
             byte[] bytes=new byte[1024*8];
             int len=-1;

             while ((len=in.read(bytes,0,bytes.length))!=-1){
                 System.out.println("len="+len);
                 out.write(bytes,0,bytes.length);

             }

            out.flush();
            in.close();
            out.close();
            System.out.println("下载成功");

        } catch (MalformedURLException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
