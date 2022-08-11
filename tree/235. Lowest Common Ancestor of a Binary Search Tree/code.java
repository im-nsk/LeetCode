class Solution {
    TreeNode findLca(TreeNode root, int p, int q)
    {
      while(root != null)
      {
        if(root.val > p && root.val > q)
          root = root.left;
        else if(root.val < p && root.val < q)
          root = root.right;
        else
          break;
      }
      return root;
    }
    public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
      
      return findLca(root, p.val, q.val);
        
    }
}