package org.example.trees;

import org.example.nodes.BinaryTreeNode;

import java.util.LinkedList;
import java.util.Stack;

public class BinaryTree {

    private BinaryTreeNode rootNode = null;

    public BinaryTree() {
        BinaryTreeNode tempRootNode = null;
        //tempRootNode = new BinaryTreeNode(1, new BinaryTreeNode(2, new BinaryTreeNode(4, null, null), null), new BinaryTreeNode(3, new BinaryTreeNode(6, null, null), null));
        tempRootNode = new BinaryTreeNode(1, null, null);
        rootNode = tempRootNode;
    }

    public void printTree() {

        if (rootNode == null) {
            System.out.println("Tree is empty");
            return;
        }

        LinkedList<BinaryTreeNode> list = new LinkedList<>();
        list.add(rootNode);
        while (!list.isEmpty()) {
            BinaryTreeNode current = list.getFirst();
            list.removeFirst();
            System.out.println(current.getNodeId());

            if (current.getLeftNode() != null) {
                list.add(current.getLeftNode());
            }

            if (current.getRightNode() != null) {
                list.add(current.getRightNode());
            }
        }
    }

    public void printTreeDepthFirst() {

        if (rootNode == null) {
            System.out.println("Tree is empty");
            return;
        }
        Stack<BinaryTreeNode> stack = new Stack<>();
        stack.push(rootNode);

        while (!stack.isEmpty()) {
            BinaryTreeNode current = stack.pop();

            System.out.println(current.getNodeId());

            if (current.getRightNode() != null) {
                stack.push(current.getRightNode());
            }

            if (current.getLeftNode() != null) {
                stack.push(current.getLeftNode());
            }
        }
    }

    public void deleteSubTree(Integer nodeId) {
        LinkedList<BinaryTreeNode> list = new LinkedList<>();
        list.add(rootNode);

        while (!list.isEmpty()) {
            BinaryTreeNode current = list.getFirst();
            list.removeFirst();

            if (current.getNodeId().equals(nodeId)) {
                rootNode = null;
                System.out.println("Full tree Deleted.");
                return;
            }

            if (current.getLeftNode() != null) {
                if (current.getLeftNode().getNodeId().equals(nodeId)) {
                    current.setLeftNode(null);
                    System.out.println("Subtree Deleted.");
                    return;
                }
            }

            if (current.getRightNode() != null) {
                if (current.getRightNode().getNodeId().equals(nodeId)) {
                    current.setRightNode(null);
                    System.out.println("Subtree Deleted.");
                    return;
                }
            }

            if (current.getLeftNode() != null) {
                list.add(current.getLeftNode());
            }

            if (current.getRightNode() != null) {
                list.add(current.getRightNode());
            }
        }
        System.out.println("Given node id not found. Can't delete anything");
    }

    public void addNode(BinaryTreeNode node) {
        LinkedList<BinaryTreeNode> list = new LinkedList<>();
        list.add(rootNode);

        while (!list.isEmpty()) {
            BinaryTreeNode current = list.getFirst();
            list.removeFirst();

            if (current.getLeftNode() != null) {
                list.add(current.getLeftNode());
            } else {
                current.setLeftNode(node);
                return;
            }

            if (current.getRightNode() != null) {
                list.add(current.getRightNode());
            } else {
                current.setRightNode(node);
                return;
            }
        }
    }
}
