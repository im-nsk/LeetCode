class Solution {
    private void countGoodNodes(TreeNode root, int preVal, int result[])
    {
        if(root == null) return;
        
        if(root.val >= preVal)
        {
            result[0]++;
            preVal = Math.max(preVal, root.val);
        }
        
        countGoodNodes(root.left, preVal, result);
        countGoodNodes(root.right, preVal, result);
    }
    public int goodNodes(TreeNode root) {
        
        int result[] = new int[1];
        
        countGoodNodes(root, Integer.MIN_VALUE, result);
        
        return result[0];
        
    }
}