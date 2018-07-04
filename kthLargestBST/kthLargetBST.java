//Find the kth Largest Node in a BST

public TreeNode findKthLargest(TreeNode root, int k) {
    if(root == null){
        return null;
    } else {
        int rightsize = size(root.right);
        if(rightsize+1 == k){
            return root;
        } else if(rightsize >= k) {
            return findKthLargest(root.right, k);
        } else {
            return findKthLargest(root.left, k - rightsize - 1);
        }
    }
}