class Solution {
    public double findMaxAverage(int[] nums, int k) {
        
        int max,sum=0;
        for(int i =0 ;i<k;i++){
            sum+=nums[i];
            
        }
        max=sum;
        int left=0,right=k;
        while(right<nums.length){
           
            
            sum-=nums[left];
             left++;
            sum+=nums[right];
            right++;
            max=Math.max(sum,max);
            
            
        }
        return (double)max/k;
    }
}