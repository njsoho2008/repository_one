package cn.edu.niit.codingke.ch7;

import java.util.Arrays;
import java.util.Comparator;

public class LambdaDemo {

  public static void main(String[] args){
      /*   Ieat ieat=new EatImple();
         ieat.eat();
         Ieat ieat1=new Ieat() {
             @Override
             public void eat() {
                 System.out.println("eat meat");
             }
         };
         ieat1.eat();
         //lambda 表达写法（闭包）,代码简单，不会生成额外的class文件，，适用于接口中只有一个方法的情形
     //接口方法无参数时候
      Ieat ieat2=()->{System.out.println("eat banana");};
      ieat2.eat();

      //接口方法带参数时候
      Ieat ieat3=(thing, name) -> {System.out.println("eat..."+thing+"   it's name is..."+name);};
ieat3.eat("orignal","新西兰");
  */
      //接口方法带返回值
      Ieat ieat4=(thing,name)->{
          System.out.println(name+":  eating "+thing);
          return 1;
      };

      ieat4.eat("juzi","张广宇");
      Ieat ieat5=(thing,name)->thing==null?0:1;


       Student[] students={new Student("zhangsan",11),new Student("lisi",12)
       ,new Student("wangwu",33)
       };
       Comparator<Student> comparator=(o1,o2)->o1.getAge()-o2.getAge();
       Arrays.sort(students,comparator);

//     Arrays.sort(students, new Comparator<Student>(){
//
//              public int compare(Student s1,Student s2)
//          {
//                  return s1.getAge()-s2.getAge();
//          }
//      });
     System.out.println(Arrays.toString(students));

  }

}

interface  Ieat{
    public int  eat(String thing,String name);
}

/*class  EatImple implements  Ieat{

    @Override
    public void eat() {
        System.out.println("eat apple");
    }
}

*/