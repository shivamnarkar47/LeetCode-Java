// Last updated: 04/07/2025, 02:18:51
import java.util.Collections;
class Solution {
    public static void sortColors(int[] a) {
     int n = a.length;
     int low = 0;
     int mid = 0;
     int high = n-1;   
     while(mid<=high){
        if(a[mid]==0){
            int temp = a[mid];
            a[mid]=a[low];
            a[low]=temp;
            low++;
            mid++;
        }
        else if(a[mid]==1) mid++;
        else {
            int temp = a[high];
            a[high]=a[mid];
            a[mid]=temp;
            high--;
        }
     }

     
    }
}