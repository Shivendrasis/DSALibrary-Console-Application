package DataStructures;

public class LinkedList {
    class Node {
        int data;
        Node next;

        public Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    public static Node head = null;
    public static Node tail = null;

    // insert method
    public void insert(int data) {
        Node newNode = new Node(data);
        if (head == null) {
            head = tail = newNode;
        } else {
            tail.next = newNode;  // Fix: insert newNode at tail
            tail = newNode;       // Update tail reference
        }
    }

    // delete method
    public int delete() {
        if (head == null) {
            System.out.println("Nothing to delete, list is empty");
            return Integer.MIN_VALUE;
        }
        int val = head.data;
        head = head.next;  // Move head to the next node
        if (head == null) {  // If the list is now empty, reset tail as well
            tail = null;
        }
        return val;
    }

    // displayList method
    public void displayList() {
        if (head == null) {
            System.out.println("List is empty");
            return;
        }
        Node current = head;  // Fix: Use a temporary pointer to traverse
        while (current != null) {
            System.out.print(current.data + " ");
            current = current.next;
        }
        System.out.println();
    }
}
