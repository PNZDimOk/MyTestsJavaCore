package Collection.list;

import java.util.Stack;

public class StackEx2 {
    public static void main(String[] args) {
        Stack<String> stack = new Stack<>();
        stack.push("Dmitrii");
        stack.push("Oleg");
        stack.push("Katya");
        stack.push("Oleg");
        System.out.println(stack);
        System.out.println(stack.pop());
        System.out.println(stack);
        System.out.println();
        while (!stack.isEmpty()){
            System.out.println(stack.peek());
            System.out.println(stack.pop());
            System.out.println(stack);
        }
    }
}
