// Last updated: 04/01/2026, 20:12:27
// The Divisors must be processed through Square Root.
1class Solution {
2
3    public int[] returnDivisors(int num) {
4        int cnt = 0;
5        int sum = 0;
6
7        int maxD = (int) Math.sqrt(num);
8        for (int i = 1; i <= maxD; i++) {
9            if (num % i == 0) {
10                // If divisors are equal, print only one
11                cnt++;
12
13                if (num / i == i)
14                    sum += i;
15
16                // Otherwise print both
17                else {
18                    cnt++;
19                    sum += i;
20                    sum += num / i;
21                }
22            }
23        }
24        return new int[] { cnt, sum };
25    }
26
27    public int sumFourDivisors(int[] nums) {
28        int sum = 0;
29        for (int i = 0; i < nums.length; i++) {
30            int[] arr = returnDivisors(nums[i]);
31            if (arr[0] == 4)
32                sum += arr[1];
33        }
34
35        return sum;
36    }
37}