// Last updated: 11/07/2025, 01:53:00
class Solution {
    public int findMin(int[] arr) {
        int n = arr.length;
        int low = 0;
        int high = n-1;
        int minAns = Integer.MAX_VALUE;
        while(low<=high){
            int mid = (low+high)/2;
            minAns = Math.min(minAns,arr[mid]);               
            
            if (arr[low]<arr[mid] ){
                minAns = Math.min(minAns,arr[low]);
                low = mid+1;
            }
            else{
                minAns = Math.min(minAns,arr[high]);
                high = mid-1;
            }


        }
        

        return minAns;
    }
}