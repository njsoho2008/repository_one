package ch13.WebCrawler;

import javafx.scene.Scene;

import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;
import java.security.PublicKey;
import java.util.ArrayList;
import java.util.Scanner;

public class WebCrawler {
    public static void main(String[] args){
     Scanner input=new Scanner(System.in);
     System.out.println("输入一个URL");
     String url=input.nextLine();
     crawler(url);
    }

    public static void crawler(String stringURL) {

        ArrayList<String> listOfPendingURLs = new ArrayList<>();
        ArrayList<String> listOfTraveredURLs = new ArrayList<>();

        listOfPendingURLs.add(stringURL);
        while (!listOfPendingURLs.isEmpty() && listOfTraveredURLs.size() <= 10) {
            String urlString = listOfPendingURLs.remove(0);
            if (!listOfTraveredURLs.contains(urlString)) {
                listOfTraveredURLs.add(urlString);
                System.out.println("crwl:" + urlString);

            }

            for (String s : getSubURLs(urlString)) {
                if (!listOfTraveredURLs.contains(s)) {
                    listOfPendingURLs.add(s);
                }
            }


        }


    }

    //    读取文本链接以及子链接
    public static ArrayList<String> getSubURLs(String urlString) {

        ArrayList<String> list = new ArrayList<>();

        try {
            URL url = new URL(urlString);
            Scanner input = new Scanner(url.openStream());
            int current = 0;
            while (input.hasNext()) {
                String line = input.nextLine();
//                System.out.println("---****----"+line);
//              从0位置开始索引遍历“http:”
                current = line.indexOf("http:", current);
                System.out.println("current=="+current);
                while (current > 0) {
//                    一个引号\”结束
                    int endIndex = line.indexOf("\"", current);
                    if (endIndex > 0) {//确定当前url是存在的
                        list.add(line.substring(current, endIndex));
                        current = line.indexOf("http:", endIndex);
                    } else {
                        current = -1;
                    }
                }
            }

        } catch (MalformedURLException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
        return list;

    }
}
