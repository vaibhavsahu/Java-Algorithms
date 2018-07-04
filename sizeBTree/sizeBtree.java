//Given a binary tree, write a method to return its size. The size of a tree is the number of nodes it contains. 

public int size(TreeNode root) {       
    if(root == null){
        return 0;
    }                       
return size(root.left) + size(root.right) + 1;
}