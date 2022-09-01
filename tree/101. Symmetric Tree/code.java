class Solution {
    private boolean checkSym(TreeNode p, TreeNode q)
    {
        if(p == null && q == null) return true;
        
        return p != null && q != null && p.val == q.val && checkSym(p.left, q.right) && checkSym(p.right, q.left);
    }
    public boolean isSymmetric(TreeNode root) {
        
        TreeNode p = root.left;
        TreeNode q = root.right;
        
        if(p == null && q == null) return true;
        
        return p != null && q != null && p.val == q.val && checkSym(p.left, q.right) && checkSym(p.right, q.left);
        
    }
}