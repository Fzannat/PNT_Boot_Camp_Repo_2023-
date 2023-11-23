package com.programming.level1.DoublyLinkedList;

class Node {
    //using protected access modifier so that it can only be accessed within the package it was declared
    protected int data;     // Declare an integer variable to store data in the node
    protected Node next;    // Declare a reference to the next node in the list
    protected Node prev;    // Declare a reference to the previous node in the list

    // Constructor to create a new node with given data
    public Node(int data) {
        this.data = data;  // Initialize the data field with the provided value
        this.next = null;  // Initialize the next pointer to null
        this.prev = null;  // Initialize the previous pointer to null
    }
}
