// Last updated: 04/07/2025, 02:17:59
class Solution {
public:
    int pivotInteger(int n) {
      double x=sqrt((n*n+n)/2);
       if((int)x==x)
        return x;
       return -1;  
    }
};