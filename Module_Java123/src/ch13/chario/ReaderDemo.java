package ch13.chario;

import java.io.*;

/*
* In
* */
public class ReaderDemo {
    public static void main(String[] args){
        File file=new File("C:/withchars.txt");
        if(file.exists()){
            System.out.println("withchars.txt is exists");
        }else {
            try {
                file.createNewFile();

            } catch (IOException e) {
                e.printStackTrace();
            }

        }



        try (FileReader fileReader = new FileReader(file)) {

            BufferedReader br = new BufferedReader(fileReader);
            String content=null;
            while ((content=br.readLine())!=null){
               System.out.println("文件内容为："+content);

            }
            br.close();
            fileReader.close();


        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
