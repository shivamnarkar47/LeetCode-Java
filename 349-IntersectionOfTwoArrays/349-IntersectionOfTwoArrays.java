// Last updated: 04/07/2025, 02:18:18
import java.util.*;
class Solution {
    public int[] intersection(int[] nums1, int[] nums2) {
        Set<Integer> v = new HashSet<Integer>();
        int x = 0;
        for(int i=0;i<nums1.length;i++){
            for(int j=0;j<nums2.length;j++){
                if(nums1[i]==nums2[j]){
                    v.add(nums1[i]);
                    break;
                }
            }
        }
        int[] c = new int[v.size()];
        int a=0;
        for(int e:v){
            c[a++] =e; 
        }
        return c;
    }
}