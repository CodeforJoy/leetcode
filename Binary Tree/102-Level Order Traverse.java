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
    List<List<Integer>> result=new ArrayList<>();
    public List<List<Integer>> levelOrder(TreeNode root) {
         Queue<TreeNode> ma=new LinkedList<>();
        List<Integer> list=new ArrayList<>();
        if(root==null)
            return result;
        list.add(root.val);
        result.add(list);
        ma.offer(root);
        help(ma);
        return result;
    }
    public void help(Queue<TreeNode> queue){
        List<Integer> ls=new ArrayList<>();
        //Queue<TreeNode> queue=new LinkedList<>();
        Queue<TreeNode> tmp=new LinkedList<>();
        if(queue==null)
            return ;
        for(TreeNode q:queue){

            if(q.left!=null){
                ls.add(q.left.val);
                tmp.offer(q.left);
            }
            if(q.right!=null){
                ls.add(q.right.val);
                tmp.offer(q.right);
            }
            if(q.left==null&&q.right==null){
                continue;
            }
        }
        if(ls.size()==0)
            return ;
        result.add(ls);
        help(tmp);
        
    }
}