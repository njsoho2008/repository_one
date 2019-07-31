package ch13.TolearnFile;

import java.io.File;

public class RenameFile {
    public static void main(String[] args){
        if(args.length!=1){
//            检查参数作为一个存在的文件路径
            System.out.println("程序需要一个文件路径作为参数");
            return;
        }
        String folderPath=args[0];
        File file=new File(folderPath);
        if(!file.exists()){
            System.out.println(folderPath+"不是有效的文件路径！");
            return;

        }
        if(!file.isFile()){
            System.out.println(folderPath+"不是有效的文件");
            return;
        }

        File renameFile=new File(file.getParent(),"myrenameFile.dat");
        if(renameFile.exists()){
            System.out.println("文件名已经占用！");
            return;
        }
        if(file.renameTo(renameFile)){
            System.out.println("文件命名成功");
        }else {
            System.out.println("文件命名失败");

        }
    }
}
