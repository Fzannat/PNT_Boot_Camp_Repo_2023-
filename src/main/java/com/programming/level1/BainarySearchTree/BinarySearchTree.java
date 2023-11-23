package com.programming.level1.BainarySearchTree;

import org.checkerframework.checker.units.qual.N;

//what is binary search tree also known as BST data structure?
//A Binary Search Tree (BST) is a binary tree data structure in which each node has at most two children,
// referred to as the left child and the right child. The key property of a BST is that for each node:
//1. All nodes in its left subtree have values less than the node's value.
//2.All nodes in its right subtree have values greater than the node's value.
public class BinarySearchTree {
    private Node root;

    public static void main(String[] args) {
        //creating object of BinarySearchTree
        BinarySearchTree bst = new BinarySearchTree();
        bst.insertAKey(10);
        bst.insertAKey(30);
        bst.insertAKey(120);
        bst.insertAKey(50);
        bst.insertAKey(80);
        bst.insertAKey(20);
        bst.insertAKey(100);
        System.out.println("ordered list:");
        bst.inOrderTraversal();


    }

    //creating a constructor to create an object of BinarySearchTree
    public BinarySearchTree(){// this is a constructor which does not take any @param, it will initialize an empty BST
        root = null;
    }

    //creating a method to insert a key
    public void insertAKey(int key){
        root = insertRec(root, key);
    }

    //this method will return a insert key in recursive way
    private Node insertRec(Node root, int key) {
        if(root == null){
            root = new Node(key);
            return root;
        }
        if(key < root.key){
            root.left = insertRec(root.left, key);
        }else{
            root.right = insertRec(root.right, key);
        }
        return root;
    }
    // Method to perform an in-order traversal of the BST
    public void inOrderTraversal() {
        inOrderTraversalRec(root);
    }

    // Recursive helper method for in-order traversal
    private void inOrderTraversalRec(Node root) {
        if (root != null) {
            // Traverse the left subtree
            inOrderTraversalRec(root.left);

            // Print the value of the current node
            System.out.print(root.key + " ");

            // Traverse the right subtree
            inOrderTraversalRec(root.right);
        }
    }

}
