// Last updated: 1/11/2026, 1:32:41 AM
1class Solution {
2    public int minimumDeleteSum(String s1, String s2) {
3      int m = s1.length();
4        int n = s2.length();
5        
6        // dp[i][j] stores the maximum ASCII sum of the common subsequence 
7        // for the first i chars of s1 and first j chars of s2.
8        int[][] dp = new int[m + 1][n + 1];
9        
10        for (int i = 1; i <= m; i++) {
11            for (int j = 1; j <= n; j++) {
12                if (s1.charAt(i - 1) == s2.charAt(j - 1)) {
13                    // If characters match, add their ASCII value to the previous common sum
14                    dp[i][j] = dp[i - 1][j - 1] + s1.charAt(i - 1);
15                } else {
16                    // If characters don't match, take the maximum common sum 
17                    // from either excluding the last char of s1 or excluding the last char of s2
18                    dp[i][j] = Math.max(dp[i - 1][j], dp[i][j - 1]);
19                }
20            }
21        }
22        
23        // Calculate the total ASCII sum of both original strings
24        int totalAsciiSum = 0;
25        for (char c : s1.toCharArray()) {
26            totalAsciiSum += c;
27        }
28        for (char c : s2.toCharArray()) {
29            totalAsciiSum += c;
30        }
31        
32        // The minimum delete sum is the total sum minus twice the maximum common sum
33        // (twice because the common characters were included in both s1 and s2 total sums)
34        return totalAsciiSum - 2 * dp[m][n];
35
36    }
37}