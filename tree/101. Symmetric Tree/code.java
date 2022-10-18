https://leetcode.com/problems/symmetric-tree/

class Solution {
    private boolean checkLeftRight(TreeNode p, TreeNode q){
        if(p == null && q == null)return true;
        
        return (p != null && q != null && p.val == q.val && checkLeftRight(p.left, q.right) && checkLeftRight(p.right, q.left));
    }
    public boolean isSymmetric(TreeNode root) {
        return checkLeftRight(root.left, root.right);
        
    }
}
