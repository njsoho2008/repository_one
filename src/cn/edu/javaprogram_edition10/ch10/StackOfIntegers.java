package cn.edu.javaprogram_edition10.ch10;

public class StackOfIntegers {
    private int[] elements;
    private int size;//当前栈中元素的个数
    public static final int DEFAULT_CAPACITY = 6;

    public StackOfIntegers() {
        this(DEFAULT_CAPACITY);
    }

    //开辟栈区
    public StackOfIntegers(int capacity) {
        elements = new int[capacity];

    }

    public void push(int value) {
        if (size < DEFAULT_CAPACITY) {
            this.elements[size++] = value;
        } else if (size >= DEFAULT_CAPACITY) {
            //生成新的增量数组
            int[] temp = new int[elements.length * 2];
            //将原来数组的内容复制到新数组中
            System.arraycopy(elements, 0, temp, 0, elements.length);
            elements = temp;
            this.elements[size++] = value;
        }

    }

    public int pop() {
        return elements[--size];
    }

    public int peek() {
        return elements[size - 1];
    }

    public boolean empty() {

        return size == 0;
    }

    public int getSize() {
        return size;
    }

    public static void main(String[] args) {
        StackOfIntegers stack = new StackOfIntegers();
        stack.push(1);
        stack.push(2);
        stack.push(3);
        stack.push(4);
        stack.push(5);
        stack.push(6);
        stack.push(7);
        stack.pop();
        stack.push(4);
        stack.push(4);
        stack.peek();
        stack.peek();
        stack.pop();
        stack.pop();

        System.out.println(stack.size);
    }

}
