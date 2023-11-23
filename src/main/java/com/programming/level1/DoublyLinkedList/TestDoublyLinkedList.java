package com.programming.level1.DoublyLinkedList;

import java.util.Scanner;

public class TestDoublyLinkedList {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        DoublyLinkedList list = new DoublyLinkedList();
        System.out.println("Doubly Linked List Test\n");
        char ch;
        /*  Perform list operations  */
        do
        {
            System.out.println("\nDoubly Linked List Operations\n");
            System.out.println("1. insert at begining");
            System.out.println("2. insert at end");
            System.out.println("3. delete at position");
            System.out.println("Enter your Choice:");
            int choice = scan.nextInt();
            switch (choice)
            {
                case 1 :
                    System.out.println("Enter integer element to insert");
                    list.insertAtStart( scan.nextInt() );
                    break;
                case 2 :
                    System.out.println("Enter integer element to insert");
                    list.insertAtEnd( scan.nextInt() );
                    break;
                case 3 :
                    System.out.println("Enter position");
                    int p = scan.nextInt() ;
                    if (p < 1 || p > list.getSize() )
                        System.out.println("Invalid position\n");
                    else
                        list.deleteAtPosition(p);
                    break;
                default :
                    System.out.println("Wrong Entry \n ");
                    break;
            }
            /*  Display List  */
            list.display();
            System.out.println("\nDo you want to continue (Type y or n) \n");
            ch = scan.next().charAt(0);

        } while (ch == 'Y'|| ch == 'y');
    }
}
