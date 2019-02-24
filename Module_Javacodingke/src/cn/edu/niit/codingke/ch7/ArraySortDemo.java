package cn.edu.niit.codingke.ch7;

import java.util.Arrays;

public class ArraySortDemo {
    Cat  ct1=new Cat("dd",11);



    public  static void main(String[] args){
        String[] str={"Jack","Tom","红军","长征","okay","安全"};
        Arrays.sort(str);
        System.out.println(Arrays.toString(str));
        int[] nums={1,11,1111,33,55,90};
        Arrays.sort(nums);
        System.out.println(Arrays.toString(nums));
           Cat[] cats={new Cat("波斯猫",11),new Cat("中华猫",5),new Cat("hellokity",8)};
        Arrays.sort(cats);
        //运行会报错，sort方法不知道按照上面样子的规则排序，
        System.out.println(Arrays.toString(cats));
       Dog[] dogs={new Dog("波斯猫",11),new Dog("中华猫",5),new Dog("hellokity",8)};
       Arrays.sort(dogs,new DogComparator());
       System.out.println(Arrays.toString(dogs));
    }

  //静态内部类，其他的三种内部类：方法内部类，成员内部类(非静态类型的)，匿名内部类
    static class Cat implements Comparable<Cat>{
        String name;
        int  age;

        public Cat() {
        }


        public Cat(String name, int age) {
            this.name = name;
            this.age = age;
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public int getAge() {
            return age;
        }

        public void setAge(int age) {
            this.age = age;
        }

        @Override
        public String toString() {
            return "Cat{" +
                    "name='" + name + '\'' +
                    ", age=" + age +
                    '}';
        }


      @Override
      public int compareTo(Cat o) {
            if (this.age>o.age) return 1;
            if(this.age<o.age) return -1;
           // if(this.age==o.age) return 0;
            return 0;
      }
  }
}
