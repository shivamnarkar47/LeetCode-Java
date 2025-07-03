// Last updated: 04/07/2025, 02:18:17
class Solution {
    public int getSum(int a, int b) {
         if (b == 0)
            return a;
        return getSum( a ^ b, (a & b) << 1);
    }
}