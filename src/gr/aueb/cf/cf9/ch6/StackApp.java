package gr.aueb.cf.cf9.ch6;

/**
 * LIFO ALGORITHM
 */
public class StackApp {
    static int[] stack = new int[10];
    static int top = -1;

    public static void main(String[] args) {
        push(1);
        push(2);
        push(3);
        push(4);
        push(5);
        push(6);

    }
    public static void push(int num){
        top++;
        stack[top] = num;
    }
    public static int pop(){
        int num = stack[top];
        top--;
        return num;
    }
    public static boolean isEmpty(){
        return top == -1;
    }
}
