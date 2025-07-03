// Last updated: 04/07/2025, 02:19:06
import java.util.Collections;

import java.util.*;
class Solution {
    public void nextPermutation(int[] nums) {
       int ind=-1;

       int n=nums.length;

       for(int i=n-2;i>=0;i--){
        if(nums[i]<nums[i+1]){
            ind=i;
            break;
        }
       }



       if(ind==-1){
        int i=0,j=n-1;
         reverse(nums,i,j);
        return;
       }


       for(int i=n-1;i>ind;i--){
        if(nums[i]>nums[ind]){
            int temp = nums[i];
            nums[i]=nums[ind];
            nums[ind]=temp;
            break;
        }
       }

        int i=ind+1,j=n-1;
       reverse(nums,i,j);
    }

    public static void reverse(int[] nums,int i,int j) {
		 while (i <= j) {
            int temp = nums[i];
            nums[i] = nums[j];
            nums[j] = temp;
            i++;
            j--;
        }
	}

  
}