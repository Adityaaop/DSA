class Solution {
    public List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {
        int maxCandies = 0;
        for (int currentCandies : candies) {
            maxCandies = Math.max(maxCandies, currentCandies);
        }
    
        List<Boolean> result = new ArrayList<>();
      
        for (int currentCandies : candies) {
            boolean canHaveGreatest = (currentCandies + extraCandies) >= maxCandies;
            result.add(canHaveGreatest);
        }
      
        return result;
    }
}