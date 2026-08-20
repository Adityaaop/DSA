class Solution {
    public int subarraysDivByK(int[] nums, int k) {
        int [] remainderFreq = new int[k];
            int count = 0;
            remainderFreq [0] = 1;
            int prefixSum = 0;
            for (int i = 0; i < nums.length; i++){
                prefixSum += nums[i];
                int currentRemainder = ((prefixSum % k) + k) % k;
                count += remainderFreq[currentRemainder ];
                remainderFreq[currentRemainder]++;
            }
            return count;
        }
    }