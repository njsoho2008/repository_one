package ch10;

//非受限通配泛型  类似于 ? extends Object

public class AnyWildCardDemo {
    public static  void main(String[] args){
        GenericStack<Integer> intStack=new GenericStack<>();
        intStack.push(1);
        intStack.push(2);
        intStack.push(-2);
        print(intStack);
    }

    public static void print(GenericStack<?> stack){
        while (!stack.isEmpty()){
            System.out.println(stack.pop()+" ");
        }

    }
///----------------------------------------------------------///
    //Generics 泛型的意思
    //    声明泛型方法 将泛型类型 <E> 置于方法头中关键字static 之后
    public static class GenericMethodDemo {
        /*
         * hashCode()方法返回对象在内存中的唯一地址，用以确定是否为同一个对象
         * */
        @Override
        public int hashCode() {
            return super.hashCode();
        }

        //    声明泛型方法 将泛型类型 <E> 置于方法头中关键字static 之后
        public static <E> void print(E[] list) {
            for (int i = 0; i < list.length; i++)
                System.out.print(list[i] + " ");
            System.out.println();


        }

        public static void main(String[] args) {
            String[] str = {"上海", "南京", "无锡", "南通"};
            Integer[] integers = {new Integer(1), new Integer(3), new Integer(9), 8, 11};


            GenericMethodDemo.<String>print(str);
            print(str);
            print(integers);

        }

    }
}
