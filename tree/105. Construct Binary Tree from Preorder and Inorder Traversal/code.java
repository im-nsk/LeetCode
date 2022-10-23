class Solution {
    int prefix = 0;
    private int findPivot(int in[], int value){
        int i = 0;
        for(i = 0; i< in.length; i++)
            if(value == in[i])
                return i;
        return i;
    }
    private TreeNode build(int inorder[], int pre[], int start, int end){
        if(start > end)
            return null;
        TreeNode Bts = new TreeNode(pre[prefix++]);
        if(start == end)
            return Bts;
        int index = findPivot(inorder, Bts.val);
        Bts.left = build(inorder, pre, start, index-1);
        Bts.right = build(inorder, pre, index+1, end);
        return Bts;
    }
    public TreeNode buildTree(int[] preorder, int[] inorder) {
        return build(inorder, preorder, 0, inorder.length-1);
        
    }
}