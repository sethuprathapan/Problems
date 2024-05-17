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
    
   
    public int goodNodes(TreeNode root) {
        int max=Integer.MIN_VALUE;
        if(root==null)return 0;
        else if(root.left==null && root.right==null){
            return 1;
        }
        
        
        return 1+(good(root.left,root.val))+(good(root.right,root.val));
        
    }
    public int good(TreeNode node , int max) {
         int count =0;
        if(node==null){return 0;}
        
        if(max<=node.val){
            
            max=node.val;
             ++count;
        }
        count+= good(node.left,max);
       count+= good(node.right,max);
       
       return count;
    }
}