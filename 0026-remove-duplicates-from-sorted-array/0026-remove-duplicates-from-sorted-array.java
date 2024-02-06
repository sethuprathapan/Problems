class Solution {
    public int removeDuplicates(int[] nums) {
        int len = nums.length;
        int j = -1;

        for(int i =0;i<len;i++){
            if(i==0){
                j++;
                nums[j]=nums[i];
                
                
                
            }
            if(nums[j]<nums[i] && i!=0 ){
                j++;
                nums[j]=nums[i];
                
                
            }
            

        }return j+1;
        
    }
}