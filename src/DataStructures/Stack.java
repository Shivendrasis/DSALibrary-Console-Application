package DataStructures;

public class Stack {
    static int max = 50;
    static int[] arr = new int[max];
    static int top = -1;

    public void push(int data) {
        if (top == max - 1) {
            System.out.println("Stack is full");
            return;
        }
        arr[++top] = data;
        System.out.println("Push element: " + data);
    }

    public void pop() {
        if (top == -1) {
            System.out.println("Stack is empty");
            return;
        }
        System.out.println("Pop element: " + arr[top--]);
    }

    public void display() {
        if (top == -1) {
            System.out.println("Stack is empty");
            return;
        }
        System.out.println("Stack elements are: ");
        for (int i = top; i >= 0; i--) {  // Fix: loop should go down from top
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }
}
