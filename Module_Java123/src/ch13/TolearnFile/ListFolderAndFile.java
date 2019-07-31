package ch13.TolearnFile;

import java.io.File;
import java.util.ArrayList;
import java.util.List;

public class ListFolderAndFile {
    public static void main(String[] args){
        if(args.length!=1){
            System.out.println("程序需要一个文件夹路径作为参数");
           return;
        }

        String folderpath=args[0];
        File folder=new File(folderpath);
        if(!folder.exists()){
            System.out.println(folderpath+"不是一个有效的路径");
            return;
        }
//        得到文件夹中所有的文件和文件夹
        File[] allfiles=folder.listFiles();
        List files=new ArrayList();
        List folders=new ArrayList();
        for(int i=0;i<allfiles.length;i++){
            if(allfiles[i].isFile()){
                files.add(allfiles[i]);  //放入文件这个list

            }else {
                folders.add(allfiles[i]);//放入文件夹这个list
            }

        }
        //分别输出文件和文件夹
        System.out.println("文件夹\""+folderpath+"\"中包含如下文件夹：");
        printPath(folders);
        System.out.println("文件夹\""+folderpath+"\"中包含如下文件：");
        printPath(files);

    }
    private static void printPath(List list){
        for(int i=0;i<list.size();i++){
            File file=(File)list.get(i);
            System.out.println(file.getName());
        }

    }


}
