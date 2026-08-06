class Solution {
    public boolean canJump(int[] nums) {
        int maximumReach = 0;
        for(int i = 0; i < nums.length; i++) {
            if(i > maximumReach) {
                return false;
            }
            maximumReach = Math.max(maximumReach, i+nums[i]);
            if(maximumReach >= nums.length - 1){
                return true;
            }

        }
        return false;
    }
}