// Last updated: 04/07/2025, 02:18:48
class Solution {
    public static void swap(int a,int b) {
        int temp = a;
        a = b;
        b = temp;
    }
    
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        int left = 0;
        int right = 0;
        int index = 0;

        
       while(left<m && right<n){
            nums1[m+n-index-1] = nums1[left];
            nums1[left] = nums2[right];
            right++;
            left++;
            index++;
        }

        while(right<n){
            nums1[m+n-index-1] = nums1[nums1.length-index-1];
            nums1[nums1.length-index-1] = nums2[right];
            right++;
            
            index++;
        }
        
       
        if(m==0){
            for(int i=0;i<nums1.length;i++){
                nums1[i] = nums2[i];
            }
        }
        if(n==0){
            return;
        }

        Arrays.sort(nums1);
        

       
    }
}