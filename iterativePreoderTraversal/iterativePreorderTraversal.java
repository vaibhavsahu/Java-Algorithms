//Iterative Preorder Traversal

public ArrayList<Integer> preorderItr(TreeNode root) {
    
ArrayList<Integer> list = new ArrayList<Integer>();
    if (root == null){
        return list;
    }

    Stack<TreeNode> stack = new Stack<TreeNode>();

    stack.push(root);

    while(!stack.isEmpty()){
        TreeNode node = stack.pop();
        list.add(node.data);
        //stack.pop();

        if(node.right != null){
            stack.push(node.right);
        }

        if(node.left != null){
            stack.push(node.left);
        }
    }
return list;
}