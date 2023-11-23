package com.programming.level1.StackUsingLinkedList;

//what is stack?
/*
A stack is a data structure that follows the Last In, First Out (LIFO) principle,
meaning that the last element added is the first one to be removed. Think of it like a stack of plates; you add a new
plate on top, and when you want to remove one, you take it from the top.
*/
//main functionality of stack
        /*  1. push(): Insert a new element into the stack i.e just insert a new element at the beginning of the linked list.
            2. pop(): Return the top element of the Stack i.e simply delete the first element from the linked list.
            3. peek(): Return the top element.
            4. display(): Print all elements in Stack.*/





public class StackUsingLinkedList {
    private Node top;     // Declare a reference to the top of the stack

    // Constructor to initialize an empty stack
    public StackUsingLinkedList() {
        this.top = null;    // Initialize top to null as the stack is initially empty
    }

    // Method to check if the stack is empty
    public boolean isEmpty() {
        return top == null;  // Return true if top is null (stack is empty), otherwise false
    }

    // Method to push an element onto the stack
    public void push(int data) {
        Node newNode = new Node(data);  // Create a new node with the given data
        newNode.next = top;             // Set the next pointer of the new node to the current top
        top = newNode;                  // Update the top to be the new node
        System.out.println("Pushed: " + data);
    }

    // Method to pop an element from the stack
    public void pop() {
        if (isEmpty()) {
            System.out.println("Stack is empty. Cannot pop.");
            return;
        }

        int poppedValue = top.data;  // Get the data of the top node
        top = top.next;              // Move the top pointer to the next node
        System.out.println("Popped: " + poppedValue);
    }

    // Method to peek at the top element of the stack without removing it
    public void peek() {
        if (isEmpty()) {
            System.out.println("Stack is empty. Cannot peek.");
            return;
        }

        System.out.println("Top element: " + top.data);
    }

    // Method to display the elements of the stack
    public void display() {
        if (isEmpty()) {
            System.out.println("Stack is empty.");
            return;
        }

        Node current = top;
        System.out.print("Stack: ");
        while (current != null) {
            System.out.print(current.data + " ");  // Print the data in the current node
            current = current.next;                 // Move to the next node
        }
        System.out.println();
    }

}
