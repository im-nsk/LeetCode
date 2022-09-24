class Solution {
    public List<List<Integer>> pathSum(TreeNode root, int target) {
        List<List<Integer>> result = new ArrayList<>();
        List<Integer> currList = new ArrayList<>();
        
        dfs(root, target, result, currList);
       
        return result;
    }
    
    private void dfs(TreeNode root, int target, List<List<Integer>> result, List<Integer> currList){
        if(root == null) return;
        currList.add(root.val);
        if(root.left == null && root.right == null && target == root.val){
            result.add(new LinkedList(currList));
            currList.remove(currList.size()-1);
            return;
        }
        else{
            dfs(root.left, target - root.val, result, currList);
            dfs(root.right, target - root.val, result, currList);
        }
        currList.remove(currList.size()-1);
    }
}