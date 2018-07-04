/*
Write a function to find the total number of leaf nodes in a binary tree. 
A node is described as a leaf node if it doesn't have any children.
If there are no leaf nodes, return 0.
*/

public int numberOfLeaves(TreeNode root) { 
    
    if(root == null){
        return 0;
    }
    if(root.left == null && root.right == null){
        return 1;
    }
return numberOfLeaves(root.left) + numberOfLeaves(root.right);
}