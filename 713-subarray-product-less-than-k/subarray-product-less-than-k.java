class Solution {
    public int numSubarrayProductLessThanK(int[] nums, int k) {
        int si = 0, ei = 0, product = 1, count = 0;
        while(ei < nums.length) {
            product *= nums[ei++];
            while(si < nums.length && product >= k) {
                product /= nums[si++];
            }
            count += (ei - si);
        }   
        return count;
    }
}