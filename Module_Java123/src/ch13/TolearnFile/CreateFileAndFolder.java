package ch13.TolearnFile;

import java.io.File;
import java.io.IOException;

public class CreateFileAndFolder {
    public static void main(String[] args){
//        文件夹路径
        String folderpath="C:"+File.separator+"niit"+File.separator
                +"testingfolder";
        String fileName="testingfile.txt";
        File folder=new File(folderpath);
        if(folder.exists()&& folder.isDirectory()){
            System.out.println("该文件夹已经存在了");
        }else {
            boolean createFolders=folder.mkdirs();
            if(createFolders){
                System.out.println("文件夹创建成功");

            }else {
                System.out.println("文件夹创建失败");
                return;
            }

        }

        File file=new File(folder,fileName);
        if(file.exists()&& file.isFile()){
            System.out.println("文件已经存在，将文件删除！");
            boolean deleteFile=file.delete();
            if(deleteFile){
                System.out.println("文件删除成功！");


            }else{
                System.out.println("文件删除失败");
            }
        }

        try{
            file.createNewFile();
            System.out.println("文件创建成功");
        } catch (IOException e) {
            e.printStackTrace();
            System.out.println("文件创建失败，错误信息。"+e.toString());
            return;
        }
    }
}
