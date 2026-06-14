// Last updated: 14/06/2026, 23:12:15
class Solution {
    public int maxArea(int[] height) {
        int l=0;
        int r=height.length-1;
        int max=0;

        while(l<r){
            int currentWater =  Math.min(height[l],height[r])*Math.abs(l-r);
            max = Math.max(max,currentWater);
           if(height[l]<height[r]) {
            l++;
            continue;
            }else{
            r--;
           }

            
        }
        return max;
    }
}