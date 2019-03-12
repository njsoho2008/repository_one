package ch13;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class GaiCuo {
    public static void main(String[] args){
        try{int k=0;
            byte[] b={(byte)0xB8,(byte)0xDF,(byte)0xCB,(byte)0xD9};
            FileInputStream fis=new FileInputStream("C:/test.dat");

                 k = fis.read(b);
                System.out.println("k=" + k);

        }
        catch (FileNotFoundException e) {
            e.printStackTrace();
        }
        catch (IOException ex){
            ex.printStackTrace();
        }

    }
}
