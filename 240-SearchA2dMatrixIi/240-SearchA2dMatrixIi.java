// Last updated: 02/05/2026, 15:41:40
class Solution {
  public int binarySearch(int[] arr, int target){
        int low = 0; 
        int high = arr.length-1;
        while(low<=high){
            int mid = (low+high)/2;
            if(arr[mid]>target){
                high = mid-1;
            }
            else if(arr[mid]==target){
                return mid;
            }
            else{
                low = mid+1;
            }

        } 

        return -1;
    }
    public boolean searchMatrix(int[][] matrix, int target) {
        // for(int i=0;i<matrix.length;i++){
        //     int ind = binarySearch(matrix[i],target);

        //     if(ind!=-1){
        //         return true;
        //     }
        // }
        

        // return false;

        int n = matrix.length;
        int m = matrix[0].length;
        int row = 0;
        int col = m-1;


        while(row < n && col >= 0 ){
            if(matrix[row][col]==target){
                return true;
            }
            else if(matrix[row][col]<target){
                row++;
            }
            else{
                col--;
            }
        }

        return false;
    }
}