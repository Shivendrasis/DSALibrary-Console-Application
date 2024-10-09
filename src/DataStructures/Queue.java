package DataStructures;

public class Queue
{

    static int max = 100;
    static int[] arr = new int[max];
    static int  rear ,front = -1;



    public  void enqueue(int data){

        if(rear == max-1){
            System.out.println("Queue is overflow");
            return;
        }
        rear = rear+1;
        arr[rear] = data;
        System.out.println("Element queued: "+data);
    }

    public  int dequeue(){
        if(rear == -1){
            System.out.println("Queue is ");
            return 0;
        }
            int front = arr[0];
            for(int i=0; i<rear; i++){
                arr[i] = arr[i+1];
        }
            rear--;
            return front;
    }

    public  void display(){
        if(front == -1){
            System.out.println("Queue is empty");
            return;
        }else {
            for(int i=front; i<=rear; i++){
                System.out.print(arr[i] + " ");
            }
            System.out.println();
        }


    }
}
