// Last updated: 10/01/2026, 02:28:15
// Optimal Solution.
1class Solution {
2  public int binarySearch(int[] arr, int target){
3        int low = 0; 
4        int high = arr.length-1;
5        while(low<=high){
6            int mid = (low+high)/2;
7            if(arr[mid]>target){
8                high = mid-1;
9            }
10            else if(arr[mid]==target){
11                return mid;
12            }
13            else{
14                low = mid+1;
15            }
16
17        } 
18
19        return -1;
20    }
21    public boolean searchMatrix(int[][] matrix, int target) {
22        // for(int i=0;i<matrix.length;i++){
23        //     int ind = binarySearch(matrix[i],target);
24
25        //     if(ind!=-1){
26        //         return true;
27        //     }
28        // }
29        
30
31        // return false;
32
33        int n = matrix.length;
34        int m = matrix[0].length;
35        int row = 0;
36        int col = m-1;
37
38
39        while(row < n && col >= 0 ){
40            if(matrix[row][col]==target){
41                return true;
42            }
43            else if(matrix[row][col]<target){
44                row++;
45            }
46            else{
47                col--;
48            }
49        }
50
51        return false;
52    }
53}