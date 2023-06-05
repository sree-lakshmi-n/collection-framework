package iterators;

import java.util.Stack;

public class StackTest {
    public static void main(String[] args) {
        Stack<Integer> stack = new Stack<>();
        stack.push(1);
        stack.push(2);
        while (!stack.empty()) {
            System.out.println(stack.peek());
            stack.pop();
        }
    }
}
