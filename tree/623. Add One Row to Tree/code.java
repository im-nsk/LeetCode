class Solution {
    private void insert(int val, TreeNode node, int depth, int n){
        if(node == null)
            return;
        if(depth == n-1){
            TreeNode t = node.left;
            node.left = new TreeNode(val);
            node.left.left = t;
            t = node.right;
            node.right = new TreeNode(val);
            node.right.right = t;
        }
        else{
            insert(val, node.left, depth + 1, n);
            insert(val, node.right, depth+1, n);
        }
    }
    public TreeNode addOneRow(TreeNode root, int val, int depth) {
        if(depth == 1)
        {
            TreeNode n = new TreeNode(val);
            n.left = root;
            return n;
        }
        insert(val, root, 1, depth);
        return root;
    }
}