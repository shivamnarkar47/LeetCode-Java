// Last updated: 1/6/2026, 9:39:29 PM
1class Solution {
2    public String convertToTitle(int columnNumber) {
3        StringBuilder result = new StringBuilder();
4        int number = columnNumber;
5    while (number > 0) {
6        int remainder = (number - 1) % 26; 
7        result.insert(0, (char) ('A' + remainder)); 
8        number = (number - 1) / 26;
9    }
10    return result.toString();
11    }
12}