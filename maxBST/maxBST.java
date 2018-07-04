//Given a Binary Search Tree, return the node with the maximum data. 
public TreeNode findMax(TreeNode root) {
    if(root == null){
        return null;
    } else if(root.right == null){
        return root;
    } else {
        //rightmost node will be the node with max value
        return findMax(root.right);
    }
}