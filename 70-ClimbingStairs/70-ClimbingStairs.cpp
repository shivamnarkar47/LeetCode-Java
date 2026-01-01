// Last updated: 02/01/2026, 01:01:24
class Solution {
public:
    int climbStairs(int n) {
         if (n <= 2) {
            return n;
        }

        int prev2 = 1;
        int prev1 = 2; 

        for (int i = 3; i <= n; i++) {
            int curr = prev1 + prev2; // f(i) = f(i-1) + f(i-2)
            prev2 = prev1;
            prev1 = curr;
        }

        return prev1; // f(n)
    }
};