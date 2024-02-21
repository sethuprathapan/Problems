class Solution {
    public int longestOnes(int[] nums, int k) {
        int count=0,left=0,sum=0;
        for(int right=0;right<nums.length;right++){
            if(nums[right]==0)count++;

            while(count>k){
                if(nums[left]==0){
                    count--;
                }
                left++;

            }
            sum=Math.max(sum,(right-left)+1);


        }return sum;
        
    }
}