package org.example;

import org.example.trees.BinaryTree;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");
        BinaryTree newBinaryTree = new BinaryTree();
        newBinaryTree.printTree();
        newBinaryTree.deleteSubTree(2);
        newBinaryTree.printTree();
    }
}