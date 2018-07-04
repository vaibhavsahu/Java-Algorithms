//height of Binary Tree

public int findHeight(TreeNode root) { 
    if(root == null){
        return 0;
    }
    int leftHeight = 0;
    if(root.left != null) {
         leftHeight = findHeight(root.left);
    }
    int rightHeight = 0;
    if(root.right != null){
        rightHeight = findHeight(root.right);
    }
return Math.max(leftHeight+1, rightHeight+1);
}