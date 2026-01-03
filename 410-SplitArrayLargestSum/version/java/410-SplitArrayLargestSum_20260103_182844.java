// Last updated: 03/01/2026, 18:28:44
/*
 * Time Complexity O(nlog(sum)) - maybe
 * 
 * Approach : For now just using the Book Allocation apporach.
*/

1class Solution {
2    public static int splitArray(int[] arr, int k) {
3        int n= arr.length;
4        // code here
5        if (n < k) return -1;
6        
7        int sum = 0;
8        int max = 0;
9        for (int pages : arr) {
10            sum += pages;
11            max = Math.max(max, pages);
12        }
13        
14        int low = max;
15        int high = sum;
16        int result = -1;
17        
18        while (low <= high) {
19            int mid = low + (high - low) / 2;
20            
21            if (canAllocate(arr, n, k, mid)) {
22                result = mid;
23                high = mid - 1;
24            } else {
25                low = mid + 1;
26            }
27        }
28        
29        return result;
30    }
31    
32    private static boolean canAllocate(int[] arr, int n, int k, int maxPages) {
33        int students = 1;
34        int pages = 0;
35        
36        for (int i = 0; i < n; i++) {
37            if (arr[i] > maxPages) return false;
38            
39            if (pages + arr[i] <= maxPages) {
40                pages += arr[i];
41            } else {
42                students++;
43                pages = arr[i];
44                
45                if (students > k) return false;
46            }
47        }
48        return true;
49    }
50}