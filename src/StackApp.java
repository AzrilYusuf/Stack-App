class Stack {
    private int maxSize;
    private long[] stackArray;
    private int top;

    public Stack(int size) {
        maxSize = size;
        stackArray = new long[maxSize];
        top = -1;
    }

    public void push(long item) {
        stackArray[++top] = item;
    }

    public long pop() {
        return stackArray[top--];
    }

    public boolean isEmpty() {
        return top == -1;
    }

    public boolean isFull() {
        return (top == maxSize -1);
    }
}

public class StackApp {
    public static void main(String[] args) {
        Stack theStack = new Stack(10);
        System.out.println("Push some items");
        theStack.push(1);
        theStack.push(2);
        theStack.push(3);
        theStack.push(4);
        theStack.push(5);
        theStack.push(6);
        theStack.push(7);
        theStack.push(8);
        theStack.push(9);
        theStack.push(10);

        System.out.println("Pop the items");
        while (!theStack.isEmpty()) {
            long value = theStack.pop();
            System.out.println(value + " ");
        }
    }
}