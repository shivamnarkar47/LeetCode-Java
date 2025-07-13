// Last updated: 13/07/2025, 23:34:00
class Solution {
    public int sumOfD(int[] nums,int divide){
        int sum = 0;
        for(int a : nums){
            sum=sum+(int)Math.ceil((double)a/(double)divide);
        }

        return sum;
    }
    public int smallestDivisor(int[] nums, int threshold) {
        int high =Arrays.stream(nums).max().getAsInt(); 
        int low = 1;
        while(low<=high){
            int mid=(low+high)/2;

            if(sumOfD(nums,mid)<=threshold){
                high = mid-1;
            }
            else{
                low = mid+1;

            }
        }

        return low;

           
    }
}