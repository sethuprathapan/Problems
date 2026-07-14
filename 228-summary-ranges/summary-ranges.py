class Solution:
    def summaryRanges(self, nums: List[int]) -> List[str]:
        # for i in range(len(nums)):
        start=0
        result = []
        
        while(start<len(nums)):
            start_index = start
            while(start + 1 < len(nums) and nums[start + 1 ] == nums[start] +1 ):
                
                start+=1
            if(nums[start_index] == nums[start] ):
                result.append(f"{nums[start]}")
            else:
                result.append(f"{nums[start_index]}->{nums[start]}")
            start+=1
        return result   
            

        