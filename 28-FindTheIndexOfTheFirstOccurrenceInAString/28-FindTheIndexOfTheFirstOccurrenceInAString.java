// Last updated: 02/05/2026, 16:14:02
class Solution {
    public int strStr(String haystack, String needle) {
        if (needle.length() > haystack.length()) {
            return -1;
        }
        
        if (haystack.equals(needle)) {
            return 0;
        }
        
        int needleLength = needle.length();
  
        for (int i = 0; i <= haystack.length() - needleLength; i++) {
            // Extract substring and compare with needle
            if (haystack.substring(i, i + needleLength).equals(needle)) {
                return i;
            }
        }
        
        return -1;
    }
}
