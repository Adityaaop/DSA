class Solution {
    public int minSubArrayLen(int target, int[] nums) {
         int si = 0, ei = 0, currentSum = 0, minWindowLength = nums.length + 1; 
        while(ei < nums.length) {
            currentSum += nums[ei];
            ei++;
            while(currentSum >= target) {
                minWindowLength = Math.min(minWindowLength, ei - si);
                currentSum -= nums[si];
                si++;
            }
        }
        return minWindowLength == nums.length + 1 ? 0 : minWindowLength;
    }
}