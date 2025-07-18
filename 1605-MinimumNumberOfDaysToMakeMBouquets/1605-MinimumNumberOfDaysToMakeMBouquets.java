// Last updated: 18/07/2025, 22:53:42
class Solution {
    public static int[] maxMin(int[] arr){
        int min= Integer.MAX_VALUE,max=Integer.MIN_VALUE;
        for(int i=0;i<arr.length;i++){
            min = Math.min(min,arr[i]);
            max = Math.max(max,arr[i]);
        }

        return new int[]{min,max};
    }
    public static boolean possible(int[] arr,int day,int m,int k){
        int cnt = 0;
        int noOfB = 0;
        for(int i=0;i<arr.length;i++){
            if(arr[i]<=day){
                cnt++;
            }
            else{
                noOfB += (cnt/k);
                cnt=0;
            }
        }
        noOfB += (cnt/k);
        return noOfB>=m;


    }
    public int minDays(int[] bloomDay, int m, int k) {
        long val= m*(long)1*(long)1*k;

        if(val > bloomDay.length) return -1;

        int[] minMax =maxMin(bloomDay);
        int low = minMax[0];
        int high = minMax[1];

        while(low<=high){
            int mid = (low+high)/2;
            if(possible(bloomDay,mid,m,k)){
                high = mid-1;
            }
            else{
                low = mid+1;
            }
        }

        return low;

    }
}