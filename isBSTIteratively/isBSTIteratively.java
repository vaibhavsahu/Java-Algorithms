//validate BST iteratively

public static boolean validateBSTItr(TreeNode root) {
 if (root == null) {
        return false;
    }
    
    TreeNode lastVisited = null;
    
    Stack<TreeNode> stack = new Stack<>();
    while (!stack.isEmpty() || root != null) {
        if (root != null) {
            stack.push(root);
            root = root.left;
        } else {
            root = stack.pop();
            
            // stop the algorithm if the visited nodes are not ordered
            if (lastVisited != null && root.data <= lastVisited.data) {
                return false;
            }
            lastVisited = root;
            
            root = root.right;
        }
    }
    
    return true;

}