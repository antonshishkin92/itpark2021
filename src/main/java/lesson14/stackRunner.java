package lesson14;

import java.util.Stack;

public class stackRunner {
    public static void main(String[] args) {
        // не рекомендуется пользоваться
        Stack<Integer>stack=new Stack<>();
        stack.add(12);
        stack.add(34);
        stack.add(16);
        stack.add(78);
        stack.add(101);
        System.out.println(stack);
        System.out.println(stack.peek());
    }
}
