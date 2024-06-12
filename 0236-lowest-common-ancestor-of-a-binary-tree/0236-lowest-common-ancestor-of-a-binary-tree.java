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
    public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
        TreeNode val=dfs(root,p,q);
        return val;
        
    }
    public TreeNode dfs(TreeNode node,TreeNode p,TreeNode q){
        if(node==null){
            return null;
        }
        if(node==p || node == q){
            return node;
        }
        TreeNode left =dfs(node.left,p,q);
        TreeNode right = dfs(node.right,p,q);
        if(left==null){
            return right;
        }else if ( right == null){
            return left;
        }else{
            return node;
        }
    }
}