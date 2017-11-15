package data_structure.stack;

public class Stack implements InterfaceStack {

    private int top;
    private int stack[];

    public Stack() {
        top = -1;
        stack = new int[100];
    }

    @Override
    public void push(int n) {
        if(!isFull())
            stack[++top] = n;
    }

    @Override
    public int pop() {
        if(!isEmpty())
            return stack[top--];
        else
            return -1;
    }

    @Override
    public int peek() {
        if(!isEmpty())
            return stack[top];
        else
            return -1;
    }

    @Override
    public boolean isEmpty() {
        return top == -1;
    }

    @Override
    public boolean isFull() {
        return top == (stack.length - 1);
    }

    @Override
    public void stackfy() {
        for(int i = top; i >= 0; i--)
            System.out.println(stack[i]);
    }

    @Override
    public void list() {
        for(int i = 0; i <= top; i++)
            System.out.println(stack[i]);
    }
}