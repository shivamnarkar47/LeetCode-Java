// Last updated: 04/07/2025, 02:18:43
class Solution {
    static {
        isPalindrome("");
    }
    public static boolean isPalindrome(String s) {

        
        StringBuilder sb = new StringBuilder();
        s = s.replaceAll("\\s+", "");
        if (s=="") return true;
        for (char c : s.toCharArray()) {
            if (!Character.isLetterOrDigit(c) && !Character.isWhitespace(c)) {
                // If it's a punctuation character, do nothing (effectively skip it)
            } else {
                sb.append(c);
            }
        }
        String originalString = sb.toString().toLowerCase();
        
        String sr = sb.reverse().toString().toLowerCase();
        // System.out.println(sr+" "+originalString);
        if(sr.compareTo(originalString) != 0 ) {
            return false;
        }
        else {
            return true;
        }
        
    }
}