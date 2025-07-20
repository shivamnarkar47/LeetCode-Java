// Last updated: 21/07/2025, 03:35:19
class Solution {
    public int daysRequired(int[] weights, int cap){
        int day = 1;
        int load = 0;

        for(int i=0;i<weights.length;i++){
            if(load+weights[i]>cap){
                day++;
                load=weights[i];
            }
            else{
                load+=weights[i];
            }
        }
        return day;
    }
    public int maxElement(int[] weights){
        int max = 0;
        for(int i=0;i<weights.length;i++){
            max = Math.max(max,weights[i]);
        }
        return max;
    }
    public int sumOfElements(int[] weights){
        int sum = 0;
        for(int i=0;i<weights.length;i++){
            sum += weights[i];
        }
        return sum;
    }

    public int shipWithinDays(int[] weights, int days) {
        int max = maxElement(weights);
        int sum = sumOfElements(weights);
        int low = max;
        int high = sum;
        int ans = 0;
        while(low<=high){
            int mid = (low+high)/2;
            int daysReq = daysRequired(weights,mid);
            if(daysReq<=days){
                ans = mid;
                high = mid-1;
            }
            else{
                low = mid+1;
            }
        }

        return ans;
        
        // for(int i=max;i<=sum;i++){
        //     int daysReq = daysRequired(weights,i);
        //     if(daysReq<=days){
        //         return i;
        //     }
        // }

        // return -1;
    }
}