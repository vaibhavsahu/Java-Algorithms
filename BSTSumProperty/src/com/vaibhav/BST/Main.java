package com.vaibhav.BST;


//Children sum property would hold for Binary Tree, not in case of BST
class BTree{
    private static class Node{
        private int data;
        private Node left;
        private Node right;

        //constructor
        Node(){
            this.data = 0;
            this.left = null;
            this.right = null;
        }

        Node(int data){
            this.data = data;
            this.left = null;
            this.right = null;
        }
     }
    private Node root;

    public BTree(){
        this.root = null;
    }

    public void addNode(int key){
        //check if tree is empty
        Node node = root;
        if(node == null){
            node = new Node(key);
        } else if(node.data > key){//left subtree
            node = node.left;
            addNode(key);
            } else{//right subtree
            node = node.right;
            addNode(key);
        }
    }

    public boolean isSumProperty(Node node){
        int left_data = 0, right_data = 0;
        //if tree is empty
        if(node == null || (node.left == null && node.right == null))
            return true;
        if(node.left != null){
            left_data = node.left.data;
        }

        if(node.right != null){
            right_data = node.right.data;
        }

        if((node.data == left_data + right_data) && (isSumProperty(node.left)) && isSumProperty(node.right)) {
            return true;
        } else {
            return false;
        }
    }
}


public class Main {

    public static void main(String[] args) {
	BTree tree = new BTree();

	tree.addNode(10 );
	tree.addNode(8);
	tree.addNode(2);
	tree.addNode(5);
	tree.addNode(3);


    }
}
