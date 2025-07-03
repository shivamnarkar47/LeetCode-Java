// Last updated: 04/07/2025, 02:18:42
class Solution {
    static {
        longestConsecutive(new int[] {});
    }

    public static int longestConsecutive(int[] nums) {
        int n = nums.length;
        if (n == 0)
            return 0;
        int longest = 0;
        int cnt = 0;
        HashSet<Integer> set = new HashSet<>();
        for (int i = 0; i < n; i++) {
            set.add(nums[i]);
        }

        for (int it : set) {
            if (!set.contains(it - 1)) {
                cnt = 1;
                int x = it;
                while (set.contains(x + 1)) {
                    x = x + 1;
                    cnt = cnt + 1;
                }

                longest = Math.max(longest, cnt);
            }
        }

        return longest;

    }
}