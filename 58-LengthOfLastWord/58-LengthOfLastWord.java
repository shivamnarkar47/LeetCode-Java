// Last updated: 04/07/2025, 02:18:54
class Solution {
    public int lengthOfLastWord(String s) {
              s.trim();
      String[] b = s.split(" ");
      return b[b.length-1].length();
    }
}