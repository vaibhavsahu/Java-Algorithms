//Number of Full Nodes in a Binary Tree
public int numberOfFullNodes(TreeNode root) { 

if(root == null){
    return 0;
    } else {
        if(root.left != null && root.right != null) {
            return 1 + numberOfFullNodes(root.left) + numberOfFullNodes(root.right);
        }
    }
return 0;
}