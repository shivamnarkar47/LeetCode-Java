// Last updated: 21/07/2025, 03:35:54
class Solution {
    public int mySqrt(int x) {
        // int ans = 0;
        // for(int i=1;i<=x;i++){
        //     long val = i*i;
        //     if(val<=(long)x){
        //         ans = (int)i;
        //     }
        //     else{
        //         break;
        //     }
        // }

        long low = 1;
        long high = x;
        while(low<=high){
            long mid = (low+high)/2;
            long val = mid*mid;
            if(val<=x){
                low=mid+1;
            }
            else{
                // ans = (int)mid;
                high = mid-1;
            }

        }
        return (int)high;
        
    }
}