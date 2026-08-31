class Solution {
    public boolean canPartition(int[] nums) {
        int sum = 0;
        for(int ele : nums) {
            sum += ele;
        }
        if(sum % 2 != 0) {
            return false;
        }
        Boolean[][] dp = new Boolean[nums.length + 1][sum / 2 + 1];
        return subsetSum(nums, 0, sum / 2, dp);
    }
    public boolean subsetSum(int[] nums, int idx, int tar, Boolean[][] dp) {
        if(tar == 0) {
            return true;
        }
        if(tar < 0 || idx > nums.length - 1) {
            return false;
        }
        if(dp[idx][tar] != null) {
            return dp[idx][tar];
        }
        boolean inc = subsetSum(nums, idx + 1, tar - nums[idx], dp);
        boolean exc = subsetSum(nums, idx + 1, tar, dp);
        dp[idx][tar] = (inc || exc); 
        return inc | exc;
 
    }
}
