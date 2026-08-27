class Solution {
    public int longestPalindromeSubseq(String s) {
        int[][] dp = new int[s.length()][s.length()];
        for(int i = 0; i < s.length(); i++) {
            for(int j = 0; j < s.length(); j++) {
                dp[i][j] = -1;
            }
        }
        return lps(s, 0, s.length() - 1, dp);
    }
    public int lps(String s, int si, int ei, int[][] dp) {
        if(si >= ei) return (si == ei) ? 1 : 0;
        if(dp[si][ei] != -1) return dp[si][ei];
        if(s.charAt(si) == s.charAt(ei)) {
            int ans = lps(s, si + 1, ei - 1, dp);
            dp[si][ei] = ans + 2;
            return ans + 2;
        }else {
            int startSkip = lps(s, si + 1, ei, dp);
            int endSkip = lps(s, si, ei - 1, dp);
            dp[si][ei] = Math.max(startSkip, endSkip);
            return Math.max(startSkip, endSkip);
        }
    }
}
