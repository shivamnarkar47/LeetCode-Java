// Last updated: 04/07/2025, 02:18:12
class Solution {
    public int subarraySum(int[] nums, int k) {
        int maxLen=0,sum=0;
        HashMap<Integer,Integer> map = new HashMap<>();
        map.put(0,1);
        for(int i=0;i<nums.length;i++){
            sum+=nums[i];
            if(map.containsKey(sum-k)){
                maxLen += map.get(sum-k);
            }
            map.put(sum,map.getOrDefault(sum,0)+1);
        }

        return maxLen;
    }
}