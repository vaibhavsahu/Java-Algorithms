//Given a binary tree, write a method to find and return the sum of all nodes of the tree iteratively. 

public int sumItr(TreeNode root) { 
    Queue<TreeNode> queue = new LinkedList<TreeNode>();
    int sum = 0;
    if(root == null){
        return 0;
    } else {
        queue.add(root);
        
        while(!queue.isEmpty()){
            TreeNode node = queue.remove();
            if(node != null){
            sum += node.data;
            }
            if(node.left != null){
            queue.add(node.left);
            }
            if(node.right != null){
            queue.add(node.right);
            }
        }
    }
    return sum;
}