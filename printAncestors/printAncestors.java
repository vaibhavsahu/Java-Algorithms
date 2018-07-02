public ArrayList<Integer> ancestorsList = new ArrayList<Integer>();
public boolean printAncestors(TreeNode root, int nodeData) {                   
        if(root==null)
        return false;
        if(nodeData == root.data)
            return true;
        if(printAncestors(root.left, nodeData) || printAncestors(root.right, nodeData))
        {
            ancestorsList.add(root.data);
            return true;
        }
        return false;
    }