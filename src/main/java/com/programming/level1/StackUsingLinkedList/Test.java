package com.programming.level1.StackUsingLinkedList;

public class Test {
    public static void main(String[] args) {
        StackUsingLinkedList list = new StackUsingLinkedList();
        list.push(12);
        list.push(14);
        list.push(4);
        list.push(15);
        System.out.println("before pop: ");
        list.display();
        list.peek();
        System.out.println("after pop:");
        list.pop();
        list.pop();
        list.display();
        list.peek();
    }

}
