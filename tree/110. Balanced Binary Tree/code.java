class Solution {
    private int findAvl(TreeNode root){
        if(root == null) return 0;
        return 1+ Math.max(findAvl(root.left), findAvl(root.right));
    }
    public boolean isBalanced(TreeNode root) {
        if(root == null) return true;
        int lh = findAvl(root.left);
        int rh = findAvl(root.right);
        
        return Math.abs(lh-rh) < 2 && isBalanced(root.left) && isBalanced(root.right);
    }
}