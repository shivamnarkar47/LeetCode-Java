// Last updated: 1/6/2026, 9:41:14 PM
class Solution {

    public int[] returnDivisors(int num) {
        int cnt = 0;
        int sum = 0;

        int maxD = (int) Math.sqrt(num);
        for (int i = 1; i <= maxD; i++) {
            if (num % i == 0) {
                // If divisors are equal, print only one
                cnt++;

                if (num / i == i)
                    sum += i;

                // Otherwise print both
                else {
                    cnt++;
                    sum += i;
                    sum += num / i;
                }
            }
        }
        return new int[] { cnt, sum };
    }

    public int sumFourDivisors(int[] nums) {
        int sum = 0;
        for (int i = 0; i < nums.length; i++) {
            int[] arr = returnDivisors(nums[i]);
            if (arr[0] == 4)
                sum += arr[1];
        }

        return sum;
    }
}