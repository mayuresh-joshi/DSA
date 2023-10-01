package org.example;

import org.example.nodes.BinaryTreeNode;
import org.example.trees.BinaryTree;

public class Main {
    public static void main(String[] args) {
        BinaryTree newBinaryTree = new BinaryTree();
        System.out.println("=======================");
        for (int i = 2; i <= 15; i++) {
            newBinaryTree.addNode(new BinaryTreeNode(i, null, null));
        }
        System.out.println("=======================");
        newBinaryTree.printTree();
        System.out.println("=======================");
        newBinaryTree.printTreeDepthFirst();
        System.out.println("=======================");
    }
}