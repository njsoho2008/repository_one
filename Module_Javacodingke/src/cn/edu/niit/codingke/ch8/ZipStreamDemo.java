package cn.edu.niit.codingke.ch8;

import java.io.*;
import java.util.zip.ZipEntry;
import java.util.zip.ZipInputStream;
import java.util.zip.ZipOutputStream;

public class ZipStreamDemo {
    private static void Compression(String zipfile,File srcfile){
        System.out.println("正在压缩中.....");
        try {
            ZipOutputStream out=new ZipOutputStream(new FileOutputStream(zipfile) );
            BufferedOutputStream bos=new BufferedOutputStream(out);
            zip(out,srcfile,srcfile.getName(),bos);
            bos.close();
            out.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
        System.out.println("压缩处理完毕！");
    }
    public  static  void  zip(ZipOutputStream zout,File src,String name,BufferedOutputStream bos){
        if(src.isDirectory()){//因为是目录，所以这里的name是目录名字
            File[] files=src.listFiles();
            if(src.length()==0) {//空文件夹
                try {
                    zout.putNextEntry(new ZipEntry(name+"/"));
                } catch (IOException e) {
                    e.printStackTrace();
                }

        }
        for(File f:files){
                //递归处理
            zip(zout,f,name+"/"+f.getName(),bos);
            }
        }else{
            //直接是文件，因此这里的name是文件名
            try {
                zout.putNextEntry(new ZipEntry(name));
                InputStream in=new FileInputStream(src);
                BufferedInputStream bis=new BufferedInputStream(in);
                byte[] bytes=new byte[1024];
                int len=-1;
                while ((len=bis.read(bytes))!=-1){
                   bos.write(bytes,0,len);
                }
                bis.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }


    }
    private static  void  Decompression(String unzipfile, String parent){
        try {
            ZipInputStream zin=new ZipInputStream(new FileInputStream(unzipfile));

           ZipEntry zipEntry=null;
           File file=null;
           //zipEntry 是文件时,doing
            while ((zipEntry=zin.getNextEntry())!=null && !zipEntry.isDirectory()){
               file=new File(parent,zipEntry.getName());
               if (!file.exists()){
                  new File( file.getParent()).mkdir();
               }
                OutputStream outputStream=new FileOutputStream(file);
           BufferedOutputStream bos=new BufferedOutputStream(outputStream);

                byte[] bytes=new byte[1024];
                int len=-1;

                while ((len=zin.read(bytes))!=-1){
                    bos.write(bytes,0,len);
                    bos.flush();

                }
                bos.close();
                System.out.println(file.getAbsolutePath()+"解压成功！");

            }

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }

    }

    public static void main(String[] args){
//        String zipfile="d:\\test_zip.zip";
//        File srcfile=new File("c:\\test");
//        Compression(zipfile,srcfile);
        Decompression("d:\\test_zip.zip","d:\\");
    }
}
