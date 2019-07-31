package ch10;

import ch9.WithAbsRectangleDemo;

public class SuperWildCardDemo {
//
//
// ? super T 下限通配，表示是T或者T的一个父类型


    public static void main(String[] args) {
        GenericStack<String> stack1 = new GenericStack<>();
        GenericStack<Object> stack2 = new GenericStack<>();
        stack2.push("java");
        stack2.push(2);
        stack2.push(new WithAbsRectangleDemo());
        stack1.push("Sun");
        add(stack1, stack2);
        AnyWildCardDemo.print(stack2);
    }

    public static <T> void add(GenericStack<T> stack1,
                               GenericStack<? super T> stack2) {
        while (!stack1.isEmpty()) {
            stack2.push(stack1.pop());
        }

    }
}
