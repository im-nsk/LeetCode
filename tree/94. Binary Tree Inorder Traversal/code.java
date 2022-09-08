class Solution {
    private void getRightNode(TreeNode root, List<Integer>result){
        if(root == null) return;
        
        getRightNode(root.left, result);
        result.add(root.val);
        getRightNode(root.right, result);
        
    }
    public List<Integer> inorderTraversal(TreeNode root) {
        
        List<Integer> result = new ArrayList<Integer>();
        if(root == null) return result;
        
        getRightNode(root, result);
        
        return result;
    }
}