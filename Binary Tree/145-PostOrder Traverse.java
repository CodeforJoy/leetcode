/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */
class Solution {
    List<Integer> ls=new ArrayList<>();
    public List<Integer> postorderTraversal(TreeNode root){
        if(root==null)
            return ls;

        if(root.left!=null)
            postorderTraversal(root.left);
        
        if(root.right!=null)
            postorderTraversal(root.right);
        ls.add(root.val);
        return ls;
    }
}