package org.example.nodes;

public class BinaryTreeNode {
    Integer nodeId;
    BinaryTreeNode leftNode;
    BinaryTreeNode rightNode;

    public BinaryTreeNode(Integer nodeId, BinaryTreeNode leftNode, BinaryTreeNode rightNode) {
        this.nodeId = nodeId;
        this.leftNode = leftNode;
        this.rightNode = rightNode;
    }

    public Integer getNodeId() {
        return nodeId;
    }

    public void setNodeId(Integer nodeId) {
        this.nodeId = nodeId;
    }

    public BinaryTreeNode getLeftNode() {
        return leftNode;
    }

    public void setLeftNode(BinaryTreeNode leftNode) {
        this.leftNode = leftNode;
    }

    public BinaryTreeNode getRightNode() {
        return rightNode;
    }

    public void setRightNode(BinaryTreeNode rightNode) {
        this.rightNode = rightNode;
    }
}
