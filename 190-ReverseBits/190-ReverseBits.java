// Last updated: 04/07/2025, 02:18:32
public class Solution {
    public int reverseBits(int n) {
          int reversed = 0;
        for (int i = 0; i < 32; i++) {
            reversed <<= 1;
            if ((n & 1) == 1) {
                reversed |= 1;
            }
            n >>= 1;
        }
        return reversed;
    }
}