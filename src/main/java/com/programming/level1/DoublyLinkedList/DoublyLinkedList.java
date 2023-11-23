package com.programming.level1.DoublyLinkedList;

/*
A doubly linked list is a type of linked list in which each node contains a data element and two pointers, one
pointing to the next node in the sequence (next pointer) and another pointing to the previous node (previous pointer).
This bidirectional linking allows for traversal in both forward and backward directions.
*/

public class DoublyLinkedList {
    //here I have used private keyword so that it can only be accessed inside this class
    private Node head;   // Declare a reference to the first node in the list (head)
    private Node tail;   // Declare a reference to the last node in the list (tail)
    private int size; // declare the size of a link list

    // Constructor to initialize an empty doubly-linked list
    public DoublyLinkedList() {
        this.head = null;  // Initialize head to null as the list is initially empty
        this.tail = null;  // Initialize tail to null as the list is initially empty
    }
    public int getSize(){
        return size;
    }

    // Method to insert a node at the beginning of the doubly-linked list
    public void insertAtStart(int data) {
        Node newNode = new Node(data);  // Create a new node with the given data
        if (head == null) {
            // If the list is empty, set both head and tail to the new node
            head = newNode;
            tail = newNode;
        } else {
            // If the list is not empty, update references to add the new node at the beginning
            newNode.next = head;   // Set the next pointer of the new node to the current head
            head.prev = newNode;   // Set the previous pointer of the current head to the new node
            head = newNode;        // Update the head to be the new node
        }
    }

    // Method to insert a node at the end of the doubly-linked list
    public void insertAtEnd(int data) {
        Node newNode = new Node(data);  // Create a new node with the given data
        if (head == null) {
            // If the list is empty, set both head and tail to the new node
            head = newNode;
            tail = newNode;
        } else {
            // If the list is not empty, update references to add the new node at the end
            tail.next = newNode;   // Set the next pointer of the current tail to the new node
            newNode.prev = tail;   // Set the previous pointer of the new node to the current tail
            tail = newNode;        // Update the tail to be the new node
        }
    }

    // Method to display the elements of the doubly-linked list
    public void display() {
        Node current = head;   // Start from the head of the list
        System.out.print("Doubly Linked List: ");
        while (current != null) {
            System.out.print(current.data + " ");  // Print the data in the current node
            current = current.next;                 // Move to the next node
        }
        System.out.println();
    }
    // Method to delete a node at a given position in the doubly-linked list
    public void deleteAtPosition(int position) {
        if (head == null) {
            System.out.println("List is empty. Cannot delete.");
            return;
        }

        Node current = head;
        int count = 1;

        // Traverse to the specified position
        while (current != null && count < position) {
            current = current.next;
            count++;
        }

        // If position is greater than the number of nodes
        if (current == null) {
            System.out.println("Invalid position. Node not found.");
            return;
        }

        // Adjust pointers to remove the node
        if (current.prev != null) {
            current.prev.next = current.next;
        } else {
            // If deleting the head node
            head = current.next;
        }

        if (current.next != null) {
            current.next.prev = current.prev;
        } else {
            // If deleting the tail node
            tail = current.prev;
        }
    }
}

