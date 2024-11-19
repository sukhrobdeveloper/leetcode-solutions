package medium;

import java.util.Objects;
import java.util.Stack;

public class MinStack {

    private Stack<Integer> stack;
    private Stack<Integer> minValue;

    public MinStack() {
        stack = new Stack<>();
        minValue = new Stack<>();
    }

    public void push(int val) {
        if (val <= minValue.peek() || minValue.isEmpty()) {
            minValue.push(val);
        }
        stack.push(val);
    }

    public void pop() {
        if (Objects.equals(stack.peek(), minValue.peek())) {
            minValue.pop();
        }
        stack.pop();
    }

    public int top() {
        return stack.peek();
    }

    public int getMin() {
        return minValue.peek();
    }

}
