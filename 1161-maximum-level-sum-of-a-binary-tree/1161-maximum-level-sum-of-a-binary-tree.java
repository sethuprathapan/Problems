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
    public int maxLevelSum(TreeNode root) {
        Queue <TreeNode> queue = new LinkedList<>();
        int max=Integer.MIN_VALUE;
        int level=0;
        int maxLevel=-1;
        if(root == null)
            return 0;
        queue.add(root);
        while(!queue.isEmpty()){
            level++;
            int sum=0;
            int len= queue.size();
            for(int i =0;i<len;i++){
              TreeNode node=queue.poll();
              sum+=node.val;
              if(node.right!=null){
                queue.add(node.right);

              }if(node.left!=null){
                queue.add(node.left);

              }
              
              
            }
            if(max<sum){
                max=sum;
                maxLevel=level;
                System.out.println(sum);
                System.out.println("level"+maxLevel);
            }
        }return maxLevel;
        
        
    }
}