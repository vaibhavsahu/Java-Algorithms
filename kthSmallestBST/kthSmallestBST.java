//Given a binary search tree and an integer k, implement a method to find and return the kth smallest node. 

ublic TreeNode findKthSmallest(TreeNode root, int k) {
    
if(root == null){
    return null;
}else{
    int leftsize = size(root.left);
    
    if(leftsize+1 == k){
        return root;
    }else if(k <= leftsize){
        return findKthSmallest(root.left, k);
    }else{
        return findKthSmallest(root.right, k - leftsize - 1);
    }
    }
}