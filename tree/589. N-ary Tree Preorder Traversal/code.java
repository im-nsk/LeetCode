/*
// Definition for a Node.
class Node {
    public int val;
    public List<Node> children;

    public Node() {}

    public Node(int _val) {
        val = _val;
    }

    public Node(int _val, List<Node> _children) {
        val = _val;
        children = _children;
    }
};
*/

class Solution {
  
     List<Integer> list = new ArrayList<>();
    public List<Integer> preorder(Node root) {
      
      if(root == null) return list;
      alignInOrder(root);
      return list;
    }
  public void alignInOrder(Node root)
  {
    if(root.children == null) return;
    
       list.add(root.val);
       for(Node child: root.children)
           alignInOrder(child);
    }
}