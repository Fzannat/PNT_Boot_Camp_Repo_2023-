package com.programming.level1.BainarySearchTree;
//this class is defining each node of the BST data structure
public class Node {
    int key;
    Node left, right;

    //this constructor will create a node with new key
    public Node(int key){
        //this keyword is used to refer the instance of the class
        this.key = key;
        left = right = null;//according to the explanation of BST sub left node has to be less than the root node, and sub right
                            //node has to be greater than the right node. so it can not be same if they are same this
                            //line will make both left and right node to be null
    }
}

