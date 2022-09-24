class Solution {
    private int heightOfTree(TreeNode root){
      // base is if null then return 0:  
        if(root == null)
            return 0;
      // get the height of left subtree.  
        int leftH = heightOfTree(root.left);
        
      // get the height of right subtree.   
        int rightH = heightOfTree(root.right);
        
      //  return by getting max between left nd right by adding 1(for including root height)
        return 1 + Math.max(leftH, rightH);
    }
    public int maxDepth(TreeNode root) {
        return heightOfTree(root);
        
    }
}