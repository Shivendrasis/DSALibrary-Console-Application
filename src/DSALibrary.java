import Algorithms.*;
import DataStructures.*;

import java.util.Scanner;


public class DSALibrary {

    //linked list method
    public static  void handleLinkedList(){
        LinkedList list = new LinkedList();
        Scanner sc = new Scanner(System.in);
        int choice;

        do{
            System.out.print("Enter your linkedlist operation: ");
            System.out.println();
            System.out.println("1. Insert element from list ");
            System.out.println("2. Delete element from list ");
            System.out.println("3. Display element ");
            System.out.println("4. Exist from linked list");
            choice = sc.nextInt();

            switch (choice){
                case (1):
                    System.out.println("Enter the element to insert: ");
                    int data = sc.nextInt();
                    list.insert(data);
                    break;

                case (2):
                    System.out.println("Element is deleting: ");
                    list.delete();
                    break;

                case (3):
                    System.out.println("Display the elements: ");
                    list.displayList();
                    break;

                case (4):
                    System.out.println("Exit from the linked list");
                    break;

                default:
                    System.out.println("Invalid choice try again !");

            }

        } while (choice != 4);
    }

    //stack method
    public static  void handleStack(){
        Stack stack = new Stack();
        Scanner sc = new Scanner(System.in);
        int choise ;

        do{
            System.out.print("Enter your stack operation: ");
            System.out.println();
            System.out.println("1. Enter element to push: ");
            System.out.println("2. Delete the element: ");
            System.out.println("3. Display the elements: ");
            System.out.println("4. Exit ");
            choise = sc.nextInt();

            switch (choise){
                case (1):
                    System.out.println("Enter element to push: ");
                    int data = sc.nextInt();
                    stack.push(data);
                    break;

                case (2):
                    System.out.println("Delete the element from stack ");
                    stack.pop();
                    break;

                case (3):
                    System.out.println("Dispaly the elements of stack ");
                    stack.display();
                    break;

                case (4):
                    System.out.println("Exit from the stack ");
                    break;

                default:
                    System.out.println("Invalid choice try again");

            }
        }
        while (choise != 4);
    }

    //queue mwthod
    public  static  void handleQueue(){
        Queue queue = new Queue();
        Scanner sc = new Scanner(System.in);
        int choice;

        do {
            System.out.print("Enter your queue operation to perform : ");
            System.out.println();
            System.out.println("1. Enter element to enqueue: ");
            System.out.println("2. Dequeue the element: ");
            System.out.println("3. Display the queue ");
            System.out.println("4. Exit ");
            choice = sc.nextInt();

            switch (choice){
                case (1):
                    System.out.println("Enter element for enqueue: ");
                    int data = sc.nextInt();
                    queue.enqueue(data);
                    break;

                case (2):
                    System.out.println("Dequeue the element: ");
                    queue.dequeue();
                    break;

                case (3):
                    System.out.println("Display the queue ");
                    queue.display();
                    break;

                case (4):
                    System.out.println("Exit from the queue ");
                    break;

                default:
                    System.out.println("Invalid choice try again");
            }

        }
        while (choice != 4);
    }

    //sorting algo method
    public static  void handleSortingingAlgorithms(){
        Scanner sc = new Scanner(System.in);
        int arr[];

        System.out.println("Enter the size of array: ");
        int size = sc.nextInt();

        arr = new int[size];

        System.out.println("Enter the elements in array ");
        for(int i=0; i<size ; i++){
            arr[i] = sc.nextInt();
        }

        SortingAlgorithm.bubbleSort(arr);

        for(int i : arr){
            System.out.print(i + "  ");
        }
        System.out.println();
    }


    //searching algo method
    public static  void handleSearchingAlgorithms(){
        Scanner sc = new Scanner(System.in);
        int arr[];

        System.out.println("Enter the size of array ");
        int size = sc.nextInt();
        arr = new int[size];

        System.out.println("Enter the elements of array ");
        for(int i=0; i<size; i++){
            arr[i] = sc.nextInt();
        }

        System.out.println("Enter the element to search ");
        int key = sc.nextInt();

        int index = SearchingAlgorithms.linearSearch(arr , key);
        if(index == -1){
            System.out.println("Key is not found ");
        }else {
            System.out.println("Key is found at index no. " + index);
        }
    }
}