package cn.edu.niit.codingke.codes_convert;

//造成乱码的根本原因：
//        1、程序使用的编码与本机的编码不统一
//        2、在网络中，客户端与服务端编码不统一（WEB开发中出现的乱码情况）


import java.io.UnsupportedEncodingException;

public class Code_Cover {
    public static void main(String[] args) {

        String str = "古道西风瘦马,断肠人在天涯";
        //把当前的编码转换成 iso8859-1；
        try {
            String newstr = new String(str.getBytes("UTF-8"), "iso8859-1");
            System.out.println(newstr);
//            System.out.println(str);
            String back_oldStr=new String(newstr.getBytes("iso8859-1"),"UTF-8");
            System.out.println(back_oldStr);
        } catch (UnsupportedEncodingException encodingException) {
            encodingException.printStackTrace();

        }

    }
}