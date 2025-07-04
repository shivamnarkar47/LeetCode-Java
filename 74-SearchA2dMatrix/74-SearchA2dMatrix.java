// Last updated: 04/07/2025, 23:17:03
class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        //     int rows=matrix.length;
        //     int cols = matrix[0].length;
        //     int top = 0;
        //     int bottom=rows-1;
        //     int row = 0;
        //     while(top<=bottom){
        //         row = (top+bottom)/2;
        //         if(target>matrix[row][cols-1]){
        //             top = row + 1;
        //         }
        //         else if(target<matrix[row][cols-1]){
        //             bottom = row-1;
        //         }
        //         else{
        //             break;
        //         }
        //     }


            
        //     if(row>=rows){
        //         return false;
        //     }
        //     System.out.println("Row: "+row);

        //     int l = 0;
        //     int r = cols-1;
            
           
        //    while(l<=r){
        //     int n = (l+r)/2;
        //     if(target<matrix[row][n]){
        //         r = n-1;
        //     }
        //     else if (target>matrix[row][n]){
        //         l = n+1;
        //     }
        //     else{
        //         return true;
        //     }
        //    }
        //     return false;



int top = 0;
        int bot = matrix.length - 1;

        while (top <= bot) {
            int mid = (top + bot) / 2;

            if (matrix[mid][0] < target && matrix[mid][matrix[mid].length - 1] > target) {
                break;
            } else if (matrix[mid][0] > target) {
                bot = mid - 1;
            } else {
                top = mid + 1;
            }
        }

        int row = (top + bot) / 2;

        int left = 0;
        int right = matrix[row].length - 1;

        while (left <= right) {
            int mid = (left + right) / 2;

            if (matrix[row][mid] == target) {
                return true;
            } else if (matrix[row][mid] > target) {
                right = mid - 1;
            } else {
                left = mid + 1;
            }
        }

        return false;        

            

            
            

    }
}