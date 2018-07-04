//Find a Node in a Binary Tree Without Using Recursion

public TreeNode findNode(TreeNode root, int val) {
    Stack<TreeNode> stack = new Stack<TreeNode>();
    
    //push the root node into Stack
    TreeNode current = root;
    
    if(current == null){
        return null;
    } 
    
    if(current.left == null && current.right == null && current.data != val){
        return null;
    }
    
     if(current.data == val){
        return current;
    }
    
    if(current.left.data == val){
        return current.left;
    }else if(current.right.data == val){
            return current.right;
    }    
   
    stack.push(current);
    
    while(current.left != null){
        current = current.left;
        if(current.data == val){
            return current;
        }
        stack.push(current);
    }
    
    while(!stack.isEmpty()){
        //pop the curent node
        TreeNode node = stack.pop();
       // if(node.data == val)
         //   return node;
        node = node.right;
        
        if(node != null && node.data == val){
                return node;
            }
        
        while(node != null && node.left != null){
            
            node = node.left;
            if(node.data == val){
                return node;
            }
            stack.push(node);
        }
    }
return null;
}