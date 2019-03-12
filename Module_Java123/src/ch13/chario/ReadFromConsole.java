package ch13.chario;

import java.io.*;

public class ReadFromConsole {
    public static void main(String[] args) {
        File file = new File("c:/readfromconsole.txt");
        if (file.exists()) {
            System.out.println("file is exist");
        } else {
            try {
                file.createNewFile();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
//从控制台输入，没有使用scaner类 ，以前经常用 注意哦

        BufferedReader bfr = null;
        FileWriter fw = null;
        String context = null;
        String endmark = "end";
        try (InputStreamReader ips = new InputStreamReader(System.in, "UTF-8")) {
            bfr = new BufferedReader(ips);
            fw = new FileWriter(file);
            while ((context = bfr.readLine()) != null) {
                if (context.equalsIgnoreCase(endmark)) {
                    break;
                }
                fw.write(context + "\r\n");
            }
            fw.close();
            bfr.close();
            System.out.println("输入结束！");
        } catch (IOException e) {
            e.printStackTrace();
        }

    }

}
