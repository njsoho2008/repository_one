package cn.edu.javaprogram_edition10.ch19;

public class TestGenericStack {


      public static  void main(String[] args){
          GenericStack<String> stack=new GenericStack<>();
          stack.push("I love Java");
          stack.push("Java Program");
          stack.push("Java NetWork");
          System.out.println(stack.peek());
          

      }

}
