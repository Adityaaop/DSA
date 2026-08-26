class Solution {
    public int longestCommonSubsequence(String text1, String text2) {
        int[][] dp = new int[text1.length()][text2.length()];
        for(int i = 0; i < dp.length; i++) {
            for(int j = 0; j < dp[0].length; j++) {
                dp[i][j] = -1;
            }
        }
        int longestCommonSubsequenceLength = lcs(text1, 0, text2, 0, dp);
        return longestCommonSubsequenceLength;
    }
    public int lcs(String s, int i, String t, int j, int[][] dp) {
        if(i == s.length() || j == t.length()) {
            return 0;
        }
        if(dp[i][j] != -1) {
            return dp[i][j];
        }
        if(s.charAt(i) == t.charAt(j)) {
            int recAns = lcs(s, i + 1, t, j + 1, dp);
            dp[i][j] = 1 + recAns; 
            return 1 + recAns;
        }else {
            int skipS = lcs(s, i + 1, t, j, dp);
            int skipT = lcs(s, i, t, j + 1, dp);
            dp[i][j] = Math.max(skipS, skipT);
            return Math.max(skipS, skipT);
        }
    }
}
