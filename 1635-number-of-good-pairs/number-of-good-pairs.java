class Solution {
    public int numIdenticalPairs(int[] nums) {
        int goodPairsCount = 0;
        int[] frequency = new int[101];
      
        for (int number : nums) {

            goodPairsCount += frequency[number];
          
            frequency[number]++;
        }
      
        return goodPairsCount;
    }
}