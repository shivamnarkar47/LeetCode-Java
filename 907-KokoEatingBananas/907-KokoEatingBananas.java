// Last updated: 18/07/2025, 23:34:52
class Solution {
    public int getReqTime(int[] arr, int hourly){
        int totalHrs = 0;
        for(int i=0;i<arr.length;i++){
            totalHrs += Math.ceil((double)arr[i]/(double)hourly);
        }

        return totalHrs;
    }
    public int maxElement(int[] arr){
        int max = 0;
        for(int i=0;i<arr.length;i++){
            max = Math.max(max,arr[i]);
        }

        return max;
        
    }
    public int minEatingSpeed(int[] piles, int h) {
        int low = 1;
        int high = maxElement(piles);
        int ans = Integer.MAX_VALUE;
        while(low<=high){
            int mid = (low+high)/2;
            int totalTime = getReqTime(piles,mid);
            
            if(totalTime<=h){
                ans = mid;
                high=mid-1;
            }
            else{
                low = mid+1;
            }
        }

        return ans;

    }
}