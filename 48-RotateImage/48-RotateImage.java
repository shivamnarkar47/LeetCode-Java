// Last updated: 04/07/2025, 02:19:01
class Solution {
    public void rotate(int[][] matrix) {
        int n = matrix.length;
        
        for(int i=0;i<n-1;i++){
            for(int j=i+1;j<n;j++){
                 int temp = matrix[i][j];
                 matrix[i][j] = matrix[j][i];
                 matrix[j][i] = temp;
            }
        }

        
        for(int i=0;i<n;i++){
            reverse(matrix[i],0,n-1);           
        }

        
        
    }

    public static void reverse(int[] nums,int start,int end) {
		while(start<end) {
			int temp = nums[start];
			nums[start] = nums[end];
			nums[end] = temp;
			start++;
			end--;
		}
	}
}