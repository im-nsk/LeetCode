class Solution {
    private void getRightSideVal(TreeNode root, List<Integer>result, int depth)
    {
        if(root == null) return;
        if(depth == result.size())
            result.add(root.val);
        getRightSideVal(root.right, result, depth+1);
        getRightSideVal(root.left,result, depth+1);
    }
    public List<Integer> rightSideView(TreeNode root) {
        
        List<Integer> result = new ArrayList<>();
        getRightSideVal(root, result, 0);
        return result;
    }
}