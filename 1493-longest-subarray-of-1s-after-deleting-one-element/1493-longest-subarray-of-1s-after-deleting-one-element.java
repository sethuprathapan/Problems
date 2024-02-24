class Solution {
    public int longestSubarray(int[] nums) {
        int count=0;
        int sum=0;
        int max=0,left=0;
        for(int i =0;i<nums.length;i++){
            
            sum++;
            if(nums[i]==0){
                count++;
            }
            while(count>1){
                
                sum--;
                if(nums[left]==0){count--;}
                left++;
            }
            max=Math.max(sum,max);
        }return max-1;
        
    }
}