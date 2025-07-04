// Last updated: 04/07/2025, 17:15:26
class Solution {
    public int findDuplicate(int[] nums) {
        int n = nums.length;
        // int i = 0;
        // int j = n - 1;
        int rabbit = 0;
        int turtle = 0;

        while (true) {
            rabbit = nums[nums[rabbit]];
            turtle = nums[turtle];
            if (rabbit == turtle) {
                int pointer = 0;
                while (pointer != turtle) {
                    pointer = nums[pointer];
                    turtle = nums[turtle];
                }
                return pointer;
            }
        }

        // Correct Soln but TLE.
        // while (i < n) {
        //     if(j==i){
        //         i++;
        //         j=n-1;
        //     }
        //     if(nums[i]==nums[j]){
        //         return nums[i];
        //     }

        //     j--;
        // }

        // return -1;

        // for(i=0;i<n;i++){
        //     for(j=i+1;j<n;j++){
        //         if(nums[i]==nums[j]){
        //             return nums[i];
        //         }

        //     }
        // }

        // return -1;

    }

}