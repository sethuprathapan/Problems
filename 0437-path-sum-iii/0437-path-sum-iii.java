/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */
class Solution {
    private int add=0;
    public int pathSum(TreeNode root, int targetSum) {
        if(root==null)return 0;
       
        helper(root,targetSum);
        
        pathSum(root.left,targetSum);
        
        pathSum(root.right, targetSum);
       // System.out.println(root.val);

        return add;
        
    }

    public void helper(TreeNode node, long sum) {
            if(node==null)return ;
            
            if(sum==node.val){
                System.out.println(node.val);
                add++;
            }sum=sum-node.val;
            helper(node.left,sum);
            helper(node.right,sum);

    }
}