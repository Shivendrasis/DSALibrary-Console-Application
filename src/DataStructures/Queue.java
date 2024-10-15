package DataStructures;

public class Queue {
    static int max = 100;
    static int[] arr = new int[max];
    static int rear = -1, front = 0;  // Fix: Initialize front to 0

    public void enqueue(int data) {
        if (rear == max - 1) {
            System.out.println("Queue overflow");
            return;
        }
        arr[++rear] = data;
        System.out.println("Element queued: " + data);
    }

    public int dequeue() {
        if (rear < front) {  // Fix: Check if queue is empty
            System.out.println("Queue is empty");
            return Integer.MIN_VALUE;
        }
        int val = arr[front];
        front++;
        return val;
    }

    public void display() {
        if (rear < front) {
            System.out.println("Queue is empty");
            return;
        }
        System.out.println("Queue elements are: ");
        for (int i = front; i <= rear; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }
}
