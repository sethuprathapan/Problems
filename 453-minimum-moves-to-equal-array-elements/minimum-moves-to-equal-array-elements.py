class Solution(object):
    def minMoves(self, nums):
        """
        :type nums: List[int]
        :rtype: int
        """
        minimum = min(nums)
        ans = 0 


        for i in nums:
            ans +=(i-minimum)

        return ans

        