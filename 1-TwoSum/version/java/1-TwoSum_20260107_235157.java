// Last updated: 07/01/2026, 23:51:57
// :)
1class Solution {
2    public int[] twoSum(int[] nums, int target) {
3        int i =0;
4        while(i<nums.length){
5            for(int j=i+1;j<nums.length;j++){
6                if(nums[i]+nums[j]==target) return new int[]{i,j};
7
8            }
9            i++;
10        }
11
12        return new int[]{-1,-1};
13    }
14}