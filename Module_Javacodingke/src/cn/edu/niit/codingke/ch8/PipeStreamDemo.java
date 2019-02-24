package cn.edu.niit.codingke.ch8;

import java.io.IOException;
import java.io.PipedInputStream;
import java.io.PipedOutputStream;

public class PipeStreamDemo {

    public static void  main(String[] args){
        PipedInputStream pin=new PipedInputStream();
        PipedOutputStream pout=new PipedOutputStream();

        try {
            pin.connect(pout);
        } catch (IOException e) {
            e.printStackTrace();
        }

        ReadThread rtd=new ReadThread(pin);
        writeThread wtd=new writeThread(pout);
        new Thread(rtd).start();
        new Thread(wtd).start();

    }



}

class  ReadThread implements  Runnable{

PipedInputStream pin=new PipedInputStream();

    public ReadThread(PipedInputStream pin) {
        this.pin = pin;
    }

    @Override
    public void run() {

        byte[] bytes=new byte[1024];
        int len=-1;
        try {
            while ((len=pin.read(bytes))!=-1){
                String s=new String(bytes,0,len);

                 System.out.println("目前读到这个位置："+s);
            }
            pin.close();
        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}


class writeThread implements  Runnable{
    PipedOutputStream pout=new PipedOutputStream();


    public writeThread(PipedOutputStream pout) {
        this.pout = pout;
    }

    @Override
    public void run() {

        try {
            pout.write("一个美女...".getBytes());
            pout.close();
        } catch (IOException e) {
            e.printStackTrace();
        }


    }
}