package cn.edu.niit.codingke.ch8;
//ObjectOutputStream 将 Java 对象的基本数据类型和图形写入 OutputStream
//        ObjectInputStream 对以前使用 ObjectOutputStream 写入的基本数据和对象进行反序列化。


import java.io.*;

public class ObjectStreamDemo {
//    把对象写入到dog.oo文件中，需要把Dog对象序列化

    public static void ObjectWrite(File file,Object o){

        OutputStream out= null;
        try {
            out = new FileOutputStream(file,true);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
        try {
            ObjectOutputStream oos=new ObjectOutputStream(out);
            oos.writeObject(o);
            oos.close();
            System.out.println("写入成功了");
        } catch (IOException e) {
            e.printStackTrace();
        }


    }
//写一组对象进入文件
    public static void ObjectWrites(File file,Object[] o){

        OutputStream out= null;
        try {
            out = new FileOutputStream(file,true);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
        try {
            ObjectOutputStream oos=new ObjectOutputStream(out);
            oos.writeObject(o);
            oos.close();
            System.out.println("写入成功了");
        } catch (IOException e) {
            e.printStackTrace();
        }


    }

//把对象从文件中读取出来，还原成对象，叫反序列化

    public  static void readObject(File file){
        try {
            InputStream in=new FileInputStream(file);
            try {

                ObjectInputStream ois=new ObjectInputStream(in);

                try {
                    Dog dog=(Dog)ois.readObject();
                    System.out.println(dog.toString());
                    ois.close();
                } catch (ClassNotFoundException e) {
                    e.printStackTrace();
                }
            } catch (IOException e) {
                e.printStackTrace();
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }


    }
    //读一组对象
    public  static void readObjects(File file) {
        try {
            InputStream in = new FileInputStream(file);
            Dog[] dogs;
            try {
                ObjectInputStream ois = new ObjectInputStream(in);
                dogs = (Dog[]) ois.readObject();
                for (Dog dog : dogs) {
                    System.out.println(dog.toString());
                }

            } catch (FileNotFoundException e) {
                e.printStackTrace();
            }


        }catch (Exception e){
            e.printStackTrace();
        }
    }



    public static  void main(String[] args){
        File file=new File("c:\\test\\dog.oo");
       Dog dog=new Dog("大花",2);
        Dog dog1=new Dog("大花2",4);
        Dog dog2=new Dog("大花3",3);
        Dog dog3=new Dog("大花4",5);
        Dog[] dogs={dog,dog1,dog2,dog3};



//   ObjectWrite(file,dog);
//        ObjectWrites(file,dogs);
    //   readObject(file);
  readObjects(file);
    }
}
