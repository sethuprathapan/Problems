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
    int maxLength=0;
    public int longestZigZag(TreeNode root) {
        if(root==null){
            return 0;

        }
        findLen(root,"left",0);
        findLen(root,"right",0);
       

        

    return maxLength;

    }
    public void findLen(TreeNode node , String direction, int len){
        if(node==null){
            return;
        }
        maxLength=Math.max(maxLength,len);

        if(direction.equals("left")){
            len++;
            findLen( node.right ,  "right",  len);
            findLen( node.left ,  "right", 0);


        }else{
            len++;
            findLen( node.left ,  "left",  len);
            findLen( node.right ,  "left", 0);

        }


    }

    
}