https://leetcode.com/problems/invert-binary-tree/

class Solution {
    public TreeNode invertTree(TreeNode root) {
        if(root == null) return null;
        
        TreeNode tempNode = root.right;
        root.right = invertTree(root.left);
        root.left = invertTree(tempNode);
        
        return root;  
    }
}