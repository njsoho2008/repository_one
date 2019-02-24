package cn.edu.niit.codingke.ch8;

import java.io.*;

public class FileDivisionMergeDemo {
    public static  void division(File fileOne,long cutsize){
        if (fileOne==null) return;
//        需要分割的文件个数
        int num=(fileOne.length()%cutsize==0)?(int)(fileOne.length()%cutsize):(int)(fileOne.length()%cutsize+1);
         System.out.println(num);
        try {
            InputStream in=new FileInputStream(fileOne);
            BufferedInputStream bis=new BufferedInputStream(in);
            BufferedOutputStream bos=null;
            byte[] bytes=null;//一次读取的文件的大小
            int len=-1;//每次实际读取的长度
            int count=0;//构造一个文件需要读取的次数
            for(int i=0;i<num;i++){
                //构造缓冲输出流
                bos=new BufferedOutputStream(new FileOutputStream(new File("c:\\test\\"+(i+1)+"-temp-"+fileOne.getName())));
            }
            if(cutsize<1024){
                bytes=new byte[(int)cutsize];
                count=1;
            }else{
                bytes=new byte[1024];
//               count=(cutsize%1024==0)?(int)(cutsize%1024):(int)(cutsize%1024+1);
              count=(int)(cutsize/1024);

            }
            try {
                while(count>0&&(len=bis.read(bytes))!=-1){

                    bos.write(bytes,0,len);

                    bos.flush();
                    count--;
                }
            } catch (IOException e) {
                e.printStackTrace();
            }
            if(cutsize%1024!=0)
            {
                bytes=new byte[(int)(cutsize%1024)];
                bos.write(bytes);
                bos.flush();
            }
            bis.close();


        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }


    }

    public  static  void merge(File f1, File f2,File fileOne){


//        try {
//            InputStream in1=new FileInputStream(f1);
//            InputStream in2=new FileInputStream(f2);
//            BufferedInputStream bis1=new BufferedInputStream(in1);
//            BufferedInputStream bis2=new BufferedInputStream(in2);
//            OutputStream out=new FileOutputStream(fileOne,true);
//            BufferedOutputStream bos1=new BufferedOutputStream(out)
//                    bos1.write(new String(bis1.));
//
//        } catch (FileNotFoundException e) {
//            e.printStackTrace();
//        }


    }

    public static void main(String[] args){
         File file=new File("C:\\工具类使用.mp4");
         long cutsize=1024*1024*20;
         FileDivisionMergeDemo.division(file,cutsize);

    }
}
