// Last updated: 04/07/2025, 02:18:01
class Solution {
    public String removeDigit(String number, char digit) {
        String maxResult = "";

        // Loop through number, remove each occurrence of digit once, and compare
        for (int i = 0; i < number.length(); i++) {
            if (number.charAt(i) == digit) {
                // Manually build the new string after removing this occurrence
                String candidate = number.substring(0, i) + number.substring(i + 1);
                if (candidate.compareTo(maxResult) > 0) {
                    maxResult = candidate;
                }
            }
        }

        return maxResult;
    }
}