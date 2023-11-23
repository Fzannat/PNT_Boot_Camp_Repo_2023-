package com.programming.level1.StackUsingLinkedList;

class Node {
    int data;        // Declare an integer variable to store data in the node
    Node next;       // Declare a reference to the next node in the linked list

    // Constructor to create a new node with the given data
    public Node(int data) {
        this.data = data;   // Initialize the data field with the provided value
        this.next = null;   // Initialize the next pointer to null
    }
}