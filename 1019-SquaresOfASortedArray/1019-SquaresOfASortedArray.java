// Last updated: 04/07/2025, 02:18:09
import java.util.*;
class Solution {
    
    public int[] sortedSquares(int[] arr) {
        for(int i=0;i<arr.length;i++){
            arr[i]=arr[i]*arr[i];
        }

        Arrays.sort(arr);
     return arr;   
    }
}