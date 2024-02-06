class Solution {
    
    public int searchInsert(int[] nums, int target) {
        return solve(nums,0,nums.length-1,target);
        
    }
    public int solve(int [] nums,int start ,int end,int target){
        int mid = (start+end) / 2 ;
        if(start<=end){
        if(nums[mid]==target){
            return mid;
        }else{
            if(target>nums[mid]){
                
                return solve(nums,mid+1,end,target);

            }else{
               return solve(nums,start,mid-1,target);

            }
        }}return start;
    } 
}