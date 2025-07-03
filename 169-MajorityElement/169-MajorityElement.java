// Last updated: 04/07/2025, 02:18:34
class Solution {
    public static int majorityElement(int[] a) {
        int cnt = 0;
        int r =0;
        for(int i=0;i<a.length;i++){
            if(cnt==0) {cnt=1;r=a[i];}
            else if(a[i]==r){ cnt++;}
            else {cnt--;}
        }

        return r;
    }

}