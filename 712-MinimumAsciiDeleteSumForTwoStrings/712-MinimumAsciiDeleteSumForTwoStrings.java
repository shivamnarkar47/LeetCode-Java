// Last updated: 02/05/2026, 15:41:29
class Solution {
    public int minimumDeleteSum(String s1, String s2) {
      int m = s1.length();
        int n = s2.length();
        
        // dp[i][j] stores the maximum ASCII sum of the common subsequence 
        // for the first i chars of s1 and first j chars of s2.
        int[][] dp = new int[m + 1][n + 1];
        
        for (int i = 1; i <= m; i++) {
            for (int j = 1; j <= n; j++) {
                if (s1.charAt(i - 1) == s2.charAt(j - 1)) {
                    // If characters match, add their ASCII value to the previous common sum
                    dp[i][j] = dp[i - 1][j - 1] + s1.charAt(i - 1);
                } else {
                    // If characters don't match, take the maximum common sum 
                    // from either excluding the last char of s1 or excluding the last char of s2
                    dp[i][j] = Math.max(dp[i - 1][j], dp[i][j - 1]);
                }
            }
        }
        
        // Calculate the total ASCII sum of both original strings
        int totalAsciiSum = 0;
        for (char c : s1.toCharArray()) {
            totalAsciiSum += c;
        }
        for (char c : s2.toCharArray()) {
            totalAsciiSum += c;
        }
        
        // The minimum delete sum is the total sum minus twice the maximum common sum
        // (twice because the common characters were included in both s1 and s2 total sums)
        return totalAsciiSum - 2 * dp[m][n];

    }
}