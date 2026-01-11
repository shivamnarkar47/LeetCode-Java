// Last updated: 1/11/2026, 11:59:01 PM
1class Solution {
2    public int strStr(String haystack, String needle) {
3        if (needle.length() > haystack.length()) {
4            return -1;
5        }
6        
7        if (haystack.equals(needle)) {
8            return 0;
9        }
10        
11        int needleLength = needle.length();
12  
13        for (int i = 0; i <= haystack.length() - needleLength; i++) {
14            // Extract substring and compare with needle
15            if (haystack.substring(i, i + needleLength).equals(needle)) {
16                return i;
17            }
18        }
19        
20        return -1;
21    }
22}
23