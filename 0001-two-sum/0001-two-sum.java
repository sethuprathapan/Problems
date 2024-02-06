class Solution {
    public int[] twoSum(int[] nums, int target) {
        int t = target;
        int[] ary = new int[2];
        for (int i = 0; i < (nums.length) - 1; i++) {
            for (int j = i + 1; j < nums.length; j++) {
                if (t == (nums[i] + nums[j])) {
                    ary[0] = i;
                    ary[1] = j;

                }
            }
        }
        return (ary);
    }
}
