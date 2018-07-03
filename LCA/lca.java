public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
    if(root==null)
        return null;
 
    if(root==p || root==q)
        return root;
 
    TreeNode l = lowestCommonAncestor(root.left, p, q);
    TreeNode r = lowestCommonAncestor(root.right, p, q);
 
    if(l!=null&&r!=null){
        return root;
    }else if(l==null&&r==null){
        return null;
    }else{
        return l==null?r:l;
    }
}