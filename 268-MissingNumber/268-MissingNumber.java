// Last updated: 04/07/2025, 02:18:24
import java.util.Vector;
import java.util.Collections;
class Solution {
    public int missingNumber(int[] nums) {
        int n = nums.length;
        int res = n;

        for(int i=0;i<n;i++){
            res += i-nums[i];
        }

        return res;

    }
}