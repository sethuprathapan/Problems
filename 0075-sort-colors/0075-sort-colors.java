class Solution {
    public void sortColors(int[] nums) {
        int front=0, back=nums.length-1;
        int i=0;
        while(i<=back){
            if(nums[i]==0){
                swap(front, i,nums);
                front++;
                i++;

            }else if (nums[i]==2){
                swap(i,back,nums);
                back--;

            }else{
                i++;
            }
            
        }
        
        
    }
     void swap(int i, int j , int [] nums){
            int temp=nums[i];
            nums[i]=nums[j];
            nums[j]=temp;
        }
}