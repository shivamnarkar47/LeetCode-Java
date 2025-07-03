// Last updated: 04/07/2025, 02:18:29
class Solution {
    public static List<Integer> majorityElement(int[] nums) {
        List<Integer> ls =new ArrayList<>();
        int cnt=0;
        int s=0;
        int n = nums.length;

        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                if(nums[i]==nums[j]){
                    cnt++;
                    s = i;
                }
            }
            if(cnt>(n/3) && !ls.contains(nums[s])){
                ls.add(nums[s]);
            
            }
                cnt=0;
        } 
        
        return ls;
    }
}