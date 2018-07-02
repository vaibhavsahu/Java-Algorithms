public String serializeTree(TreeNode root){
    StringBuilder sb = new StringBuilder();
    serializeTreeHelper(root,sb);
    if(sb.length() > 0) sb.deleteCharAt(0);
    return sb.toString();
}

private StringBuilder serializeTreeHelper(TreeNode t, StringBuilder sb){
    if(t == null) sb.append(",null");
    else {
        sb.append(","+t.data);
        serializeTreeHelper(t.left, sb);
        serializeTreeHelper(t.right, sb);
    }
    return sb;
}

public TreeNode restoreTree(String str){
    String[] nodesSplit = str.split(",");
    LinkedList<String> nodesList = new LinkedList<>(Arrays.asList(nodesSplit));
    return restoreTreeHelper(nodesList);
}

public TreeNode restoreTreeHelper(LinkedList<String> nodes){
    String nodeDataStr = nodes.remove();
    if(nodeDataStr.equals("null")) return null;
    TreeNode t = new TreeNode(Integer.valueOf(nodeDataStr));
    t.left = restoreTreeHelper(nodes);
    t.right = restoreTreeHelper(nodes);
    return t;
}