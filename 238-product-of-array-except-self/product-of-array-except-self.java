class Solution {
    //
    public int[] productExceptSelf(int[] nums) {
        int[] prefixProduct = new int[nums.length];
        prefixProduct[0] = nums[0];
        for(int i = 1; i < nums.length; i++) {
            prefixProduct[i] = prefixProduct[i - 1] * nums[i];
        }
        int[] suffixProduct = new int[nums.length];
        suffixProduct[nums.length - 1] = nums[nums.length - 1];
        for(int i = nums.length - 2; i >= 0; i--) {
            suffixProduct[i] = suffixProduct[i + 1] * nums[i];
        }
        int[] productArray = new int[nums.length];
        productArray[0] = suffixProduct[1];
        productArray[nums.length - 1] = prefixProduct[nums.length - 2];
        for(int i = 1; i < nums.length - 1; i++) {
            productArray[i] = prefixProduct[i - 1] * suffixProduct[i + 1];
        }
        return productArray;
    }
}
/*
nums.length = 4
 
 
idx =>   0, 1, 2, 3
nums => [2, 4, 6, 8]
ans =>  [192, 96, 64, 48]
 
nums[1] = pre[0] * suf[2];
nums[1] = 2 * 48;
 
 
 
pre[3] = pre[2] * nums[3]
pre => [2, 8, 48, 394]
suf => [384, 192, 48, 8]
suf[1] = suf[2] * nums[1]
*/