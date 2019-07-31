package ch13.byteio;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class TestFileOutputStream {
    public static void main(String[] args){
        try (FileOutputStream fos = new FileOutputStream("c:/temp.dat")) {
            for(int i=1;i<11;i++){
                fos.write(i);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }

        try(FileInputStream fis=new FileInputStream("c:/temp.dat")){
            int value;
            while ((value=fis.read())!=-1){
                System.out.print(value+" ");
            }

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}
