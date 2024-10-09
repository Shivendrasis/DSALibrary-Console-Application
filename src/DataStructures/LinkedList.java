package DataStructures;

public class LinkedList
{
    class Node{
        int data;
        Node next;

        public Node(int data){
            this.data = data;
            this.next = null;
        }
    }

    public static Node head = null;
    public static Node tail = null;

    //insert method
    public void insert(int data){
      Node newNode = new Node(data);
      if(head == null){
          head = tail = newNode;
          return;
      }
      head.next = newNode;
      head = newNode;
    }

    //delete method
    public int delete(){
        if(head == null){
            System.out.println("Nothing to delete list is empty");
            return Integer.MIN_VALUE;
        }
        int val = head.data;
        head.next = head;
        return  val;
    }

    //displayList method
    public  void displayList(){
        if(head == null){
            System.out.println("List is empty");
        }
        while (head != null){
            System.out.print(head.data + " ");
            head = head.next;
            System.out.println();
        }
    }
}
