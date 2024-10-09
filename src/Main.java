import Algorithms.*;
import DataStructures.*;

import java.util.Scanner;


public class Main {
    public static void main(String[] args) {
        DSALibrary dsa = new DSALibrary();
        Scanner sc = new Scanner(System.in);
        int choice;

        do {
            System.out.println("\nWelcome to the DSA Library!");
            System.out.println("1. Linked List");
            System.out.println("2. Stack");
            System.out.println("3. Queue");
            System.out.println("4. Sorting Algorithms");
            System.out.println("5. Searching Algorithms");
            System.out.println("6. Exit");
            System.out.println();
            System.out.println("______________________________");
            System.out.print("Enter your choice: ");


            choice = sc.nextInt();

            switch (choice) {
                case 1:
                    dsa.handleLinkedList();
                    break;
                case 2:
                    dsa.handleStack();
                    break;
                case 3:
                    dsa.handleQueue();
                    break;
                case 4:
                    dsa.handleSortingingAlgorithms();
                    break;
                case 5:
                    dsa.handleSearchingAlgorithms();
                    break;
                case 6:
                    System.out.println("Exiting the DSA Library. Goodbye!");
                    break;
                default:
                    System.out.println("Invalid choice. Please try again.");
            }
        } while (choice != 6);

        sc.close();
    }
    }

