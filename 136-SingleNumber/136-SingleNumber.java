// Last updated: 04/07/2025, 02:18:40
class Solution {
    public int singleNumber(int[] a) {
        int XOR = 0;
        for(int i=0;i<a.length;i++){
            XOR ^= a[i];
        }
        return XOR;
    }
}