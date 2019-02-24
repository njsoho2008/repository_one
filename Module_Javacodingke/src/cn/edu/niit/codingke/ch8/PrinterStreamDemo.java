package cn.edu.niit.codingke.ch8;

import java.io.*;
import java.util.Scanner;

//字节打印流 printerStream
//字符打印流 printerWriter
public class PrinterStreamDemo {
    public static void bytesPrint(File file,Scanner scanner){
        try {
            OutputStream out=new FileOutputStream(file,true);
            BufferedOutputStream bout=new BufferedOutputStream(out);
            PrintStream ps=new PrintStream(bout);

            ps.println( scanner.next());
            ps.close();
            try {
                bout.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
            try {
                out.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }

    }

    public static void charPrint(File file,Scanner scanner){
        try {
            Writer wr=new FileWriter(file,true);
            BufferedWriter bw=new BufferedWriter(wr);
            PrintWriter pw=new PrintWriter(bw);
            String s=scanner.next();
            pw.print(s);
            pw.close();
            bw.close();
            wr.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static void main(String[] args){
        Scanner scanner=new Scanner(System.in);

        File file=new File("c:\\test\\my\\wrfile.txt");
//        if (file==null)
//        file.mkdirs();
//        bytesPrint(file,scanner);
        charPrint(file,scanner);
    }
}
