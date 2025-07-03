// Last updated: 04/07/2025, 02:19:14
class Solution {
    public List<List<Integer>> fourSum(int[] nums, int target) {
        List<List<Integer>> ans = new ArrayList<>();
        Arrays.sort(nums);
        int n = nums.length;
        for (int i = 0; i < nums.length; i++) {
            if (i > 0 && nums[i] == nums[i - 1])
                continue;
            for (int j = i + 1; j < n; j++) {
                if (j != i+1 && nums[j] == nums[j - 1])
                    continue;
                int k = j + 1;
                int m = n - 1;

                while (k < m) {
                    long sum = nums[i] ;
                    sum += nums[j];
                    sum += nums[m];
                    sum+= nums[k];
                    if (sum == target) {
                        List<Integer> temp = new ArrayList<>();
                        temp.add(nums[i]);
                        temp.add(nums[j]);
                        temp.add(nums[m]);
                        temp.add(nums[k]);
                        ans.add(temp);

                        k++;
                        m--;
                        while (k < m && nums[m] == nums[m + 1])
                            m--;
                        while (k < m && nums[k] == nums[k - 1])
                            k++;
                    } else if (sum < target) {
                        k++;
                    } else {
                        m--;
                    }

                }
            }

        }

        return ans;

    }
}